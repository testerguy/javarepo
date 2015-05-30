import java.awt.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;

public class JChat_Client extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private String serverIP;
	private Socket connection;
	
	public JChat_Client (String host) {
		super("Client Java Messenger");
		serverIP = host;
		
		userText = new JTextField();
		makeEditable(false);
		
		userText.addActionListener(
			new ActionListener() {
				public void actionPerformed (ActionEvent event) {
					sendMessage(event.getActionCommand());
					userText.setText("");
				}
			}
		);
		
		add(userText, BorderLayout.SOUTH);
		
		chatWindow = new JTextArea();
		add(new JScrollPane(chatWindow));
		
		setSize(400,300);
		setVisible(true);
	}
	
	public void startRunning() {
		try {
			// do infinite loop with while(true)
			while (true) {
				try {
					connectToServer();
					setupStreams();
					whileChatting();
				} catch(EOFException eofe) {
					eofe.printStackTrace();
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void connectToServer() throws IOException {
		showMessage("trying to connect.. ");
		connection = new Socket(InetAddress.getByName(serverIP), 5678);
		showMessage("connected to server at " + connection.getInetAddress().getHostName());
	}
	
	public void setupStreams() throws IOException {
		showMessage("setting up streams..");
		input = new ObjectInputStream(connection.getInputStream());
		output = new ObjectOutputStream(connection.getOutputStream());
		showMessage("streams set up!");
	}
	
	public void whileChatting() throws IOException {
		String message = "Chat started!";
		showMessage(message);
		makeEditable(true);
		
		do {
			try {
				message = "SERVER - " + (String) input.readObject();
				showMessage(message);
			} catch(ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}
		} while (!message.equals("SERVER - END"));
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
	
	public void sendMessage(String s) {
		try {
			output.writeObject(s);
			String sendStr = "CLIENT - " + s;
			showMessage(sendStr);
		} catch (IOException ioe) {
			showMessage("couldn't send!");
		}
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
		showMessage("closing everything!");
		makeEditable(false);
		try {
			input.close();
			output.close();
			connection.close();
		} catch(IOException ioe) {
			showMessage("couldn't close!");
		}
	}
}