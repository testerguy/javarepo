import javax.swing.*;
import java.awt.*;

public class DrawGraphics2_Main {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		DrawGraphics2 drawObj = new DrawGraphics2();
		
		j.add(drawObj);
		
		j.setBackground(Color.WHITE);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(600,500);
		j.setVisible(true);
	}
}