import java.awt.*;
import javax.swing.*;

public class DrawGraphics extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.BLUE);
		g.fillRect(100, 25, 100, 50);
		
		g.setColor(new Color(250,250,0));
		g.fillRect(100, 100, 100, 50);
		
		g.setColor(Color.RED);
		g.drawString("This is string", 100, 200);
	}
}