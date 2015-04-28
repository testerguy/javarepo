import java.awt.*;
import javax.swing.*;

public class DrawGraphics extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
		g.fillRect(100, 25, 100, 50);
		
		g.setColor(Color.BLUE);
		g.fillRect(100, 150, 100, 75);
		
		g.setColor(Color.ORANGE);
		g.drawString("this is a string", 100, 300);
	}
}