import javax.swing.*;

public class JChat_Client_Run {
	public static void main(String[] args) {
		JChat_Client chatObj = new JChat_Client();
		
		chatObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chatObj.startRunning("127.0.0.1");
	}
}
