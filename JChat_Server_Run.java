import javax.swing.*;

public class JChat_Server_Run {
	public static void main(String[] args) {
		JChat_Server chatObj = new JChat_Server();
		
		chatObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		chatObj.startRunning();
	}
}