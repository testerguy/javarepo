import java.awt.FlowLayout;

import javax.swing.JFrame;

public class JFrameGUI_Main {
	public static void main(String[] args) {
		JFrameGUI GUIObj = new JFrameGUI();
		
		GUIObj.setSize(300,100);
		GUIObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUIObj.setVisible(true);
	}
}