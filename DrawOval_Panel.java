import java.awt.*;
import javax.swing.*;

public class DrawOval_Panel extends JPanel {
	private int d = 10;
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		
		g.fillOval(25, 25, d, d);
	}
	
	public void setD (int val) {
		d = (val >= 0 ? val : 10);
		repaint();
	}
	
	public Dimension setPreferredSize() {
		Dimension dim = new Dimension(200, 200);
		
		return dim;
	}
	
	public Dimension setMinimumSize() {
		return setPreferredSize();
	}
}