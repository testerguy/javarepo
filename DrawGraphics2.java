import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DrawGraphics2 extends JPanel {
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
		g.drawRect(100, 25, 100, 40);
		
		g.setColor(Color.CYAN);
		g.drawLine(100, 115, 400, 200);
		
		g.setColor(Color.MAGENTA);
		g.fill3DRect(100, 165, 100, 60, true);
		
		g.setColor(Color.BLUE);
		g.fillRect(100, 275, 100, 60);
	}
}