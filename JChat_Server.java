import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class JChat_Server extends JFrame {
	private JTextField userText;
	private JTextArea chatWindow;
	private ObjectOutputStream output;
	private ObjectInputStream input;
	private Socket connection;
	private ServerSocket server;
	
	public JChat_Server() {
		super("Java Chat - Server");
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
		// do infinite loop with while(true)
		try {
			server = new ServerSocket(4545, 100);
			try {
				waitForConnection();
				setupStreams();
				whileChatting();
			} catch(EOFException eofe) {
				eofe.printStackTrace();
			} finally {
				closeEverything();
			}
		} catch(IOException ioe) {
			showMessage("couldn't start server!");
		}
		
	}
	
	public void waitForConnection() throws IOException {
		showMessage("waiting for connection.. ");
		connection = server.accept();
		showMessage("connected to " + connection.getInetAddress().getHostName());
	}
	
	public void setupStreams() throws IOException {
		input = new ObjectInputStream(connection.getInputStream());
		output = new ObjectOutputStream(connection.getOutputStream());
		showMessage("streams set up!");
	}
	
	public void whileChatting() throws IOException {
		
		String message = "Start chatting!";
		showMessage(message);
		
		// make userText field editable
		makeEditable(true);
		
		// do while (!message.equals("CLIENT - END"));
		do {
			try {
				message = "CLIENT - " + (String) input.readObject();
				showMessage(message);
			} catch(ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}
		} while(!message.equals("CLIENT - END"));
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
		makeEditable(false);
		showMessage("closing everything!");
		
		try {
			input.close();
			output.close();
			connection.close();
		} catch(IOException ioexception) {
			showMessage("couldn't close everything!");
		}
	}
}