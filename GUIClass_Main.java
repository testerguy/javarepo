import javax.swing.JFrame;

public class GUIClass_Main {
	public static void main(String[] args) {
		GUIClass GUIObj = new GUIClass();
		
		GUIObj.setSize(300,200);
		GUIObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GUIObj.setVisible(true);
	}
}