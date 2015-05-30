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
	private ServerSocket server;
	private Socket connection;
	
	public JChat_Server() {
		super("Server Java Messenger");
		
		userText = new JTextField();
		userText.setEditable(false);
		
		chatWindow = new JTextArea();
		
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed (ActionEvent event) {
						sendMessage(event.getActionCommand());
						userText.setText("");
					}
				}
		);
		
		add(userText, BorderLayout.SOUTH);
		
		add(new JScrollPane(chatWindow));
		
		setSize(400,300);
		setVisible(true);
	}
	
	public void startRunning() {
		try {
			server = new ServerSocket(5678, 100);
			// run infinite loop with while(true)
			while (true) {
				try {
					waitForConnection();
					setupStreams();
					whileChatting();
				} catch(EOFException eofe) {
					eofe.printStackTrace();
				}
				finally {
					closeEverything();
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void waitForConnection() throws IOException {
		chatWindow.append("\nwaiting for connection..");
		connection = server.accept();
		chatWindow.append("\nconnected to " + connection.getInetAddress().getHostName());
	}
	
	public void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		input = new ObjectInputStream(connection.getInputStream());
		
		chatWindow.append("\nstreams setup!");
	}
	
	public void whileChatting() throws IOException {
		String message = "\nready to chat!";
		chatWindow.append(message);
		makeEditable(true);
		do {
			try {
				message = "CLIENT - " + (String) input.readObject();
				showMessage(message);
			} catch (ClassNotFoundException cnfe) {
				cnfe.printStackTrace();
			}
		} while (!message.equals("CLIENT - END"));
	}

	public void sendMessage(String s) {
		try {
			output.writeObject(s);
			showMessage("SERVER - " + s);
		} catch (IOException ioe) {
			chatWindow.append("\nsomething with wrong with the message send!");
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
		try {
			input.close();
			output.close();
			connection.close();
		} catch (IOException ioe) {
			showMessage("couldn't close something!");
		}
	}
}