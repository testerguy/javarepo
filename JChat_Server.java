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
		super("Java messenger program!");
		
		userText = new JTextField();
		userText.setEditable(false);
		
		userText.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						try {
							sendMessage(event.getActionCommand());
						} catch (IOException ioException) {
							showMessage("\nCouldn't send message!");
						}
						userText.setText("");
					}
				}
		);
	add(userText, BorderLayout.SOUTH);
	
	setSize(500,500);
	setVisible(true);
	
	chatWindow = new JTextArea();
	add(chatWindow);
	}
	
	public void startRunning() throws IOException {
		// do infinite loop with while(true)
		try {
			server = new ServerSocket(6789, 100);
			while (true) {
				try {
					makeConnection();
					setupStreams();
					whileChatting();
				} catch(EOFException eofException) {
					eofException.printStackTrace();
				} finally {
					closeEverything();
				}
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	
	public void makeConnection() throws IOException {
		showMessage("waiting for connection..");
		connection = server.accept();
		showMessage("\nconnected to " + connection.getInetAddress().getHostName());
	}
	
	public void setupStreams() throws IOException {
		output = new ObjectOutputStream(connection.getOutputStream());
		output.flush();
		input = new ObjectInputStream(connection.getInputStream());
		showMessage("\nstreams set up!");
	}
	
	public void whileChatting() throws IOException {
		String message = "\nchat started!";
		showMessage(message);
		// do while (!message.equal("CLIENT - END")
		try {
			makeEditable();
			message = (String) input.readObject();
			showMessage(message);
		} catch (ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		}
	}
	
	public void sendMessage(String s) throws IOException {
		try {
			String str = "SERVER - " + s;
			output.writeObject(str);
			output.flush();
			showMessage("\n" + str);
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	
	public void showMessage(final String str) {
		// create a new thread
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					chatWindow.append(str);
				}
			}
		);
	}
	
	public void makeEditable() {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					userText.setEditable(true);
				}
			}
		);
	}
	
	public void closeEverything() throws IOException {
		
		showMessage("\nchat ending!");
		try {
			connection.close();
			input.close();
			output.close();
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
}