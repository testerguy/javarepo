import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class JChat_Client extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Socket connection;
	private String serverIP;
	
	public JChat_Client(String host) {
		super("Java Chat Client");
		
		serverIP = host;
	
		userText = new JTextField();
		makeEditable(false);
		chatWindow = new JTextArea();
		
		userText.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					sendMessage(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		
		add(userText, BorderLayout.SOUTH);
		add(new JScrollPane(chatWindow));
		
		setSize(300,400);
		setVisible(true);
	}
	
	public void startRunning() {
		try{
			// do infinite loop with while(true)
			while(true) {
				try {
					connectToServer();
					setupStreams();
					whileChatting();
				} catch(EOFException eofe) {
					eofe.printStackTrace();
				} finally {
					closeEverything();
				}
			}
		} catch(IOException ioe) {
			showMessage("something went wrong!");
		}
	}
	
	public void connectToServer() throws IOException {
		showMessage("trying to connect to Server..");
		boolean connectionYN = true;
		while (connectionYN) {
			try {
				connection = new Socket(InetAddress.getByName(serverIP), 4567);
				showMessage("connected to " + connection.getInetAddress().getHostName());
				connectionYN = false;
			} catch(IOException e) {
			}		
		}
	}
	
	public void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("streams set up!");
	}
	
	public void whileChatting() throws IOException {
		// make userText field editable
		makeEditable(true);
		
		String message = "Start chatting";
		showMessage(message);
		try {
			// chat while !message.equals("SERVER - END")
			do {
				message = "SERVER - " + (String)input.readObject();
				showMessage(message);
			} while (!message.equals("SERVER - END"));
		} catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	
	public void sendMessage(String s) {
		try {
			output.writeObject(s);
			showMessage("SERVER - " + s);
		} catch(IOException ioe) {
			showMessage("couldn't send message!");
		}
	}
	
	public void showMessage(final String s) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					final String finalStr = "\n" + s;
					chatWindow.append(finalStr);
				}
			}
		);
	}
	
	public void makeEditable(final boolean tof) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					userText.setEditable(tof);
				}
			}
		);
	}
	
	public void closeEverything() {
		// make userText field uneditable again
		makeEditable(false);
		showMessage("closing everything!");

		try {
			output.close();
			input.close();
			connection.close();
		} catch(IOException ioe) {
			showMessage("Could not close everything!");
		}
	}
}