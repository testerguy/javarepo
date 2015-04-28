import javax.swing.*;

public class DrawGraphics_Main {
	public static void main (String[] args) {
		JFrame j = new JFrame();
		DrawGraphics p = new DrawGraphics();
		j.add(p);
		
		j.setSize(500,500);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		
	}
}