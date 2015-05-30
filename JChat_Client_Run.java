import javax.swing.*;

public class JChat_Client_Run {
	public static void main(String[] args) {
		JChat_Client chatObj = new JChat_Client("127.0.0.1");
		
		chatObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chatObj.startRunning();
	}
}