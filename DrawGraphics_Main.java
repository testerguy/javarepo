import javax.swing.*;

public class DrawGraphics_Main {
	public static void main (String[] args) {
		JFrame j = new JFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		DrawGraphics drawObj = new DrawGraphics();
		j.add(drawObj);
		j.setSize(500,600);
		j.setVisible(true);
	}
}