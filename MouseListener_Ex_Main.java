import javax.swing.*;

public class MouseListener_Ex_Main {
	public static void main(String[] args) {
		MouseListener_Ex mouseObj = new MouseListener_Ex();
		
		mouseObj.setSize(400,400);
		mouseObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseObj.setVisible(true);
	}
}
