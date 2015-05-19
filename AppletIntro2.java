import java.awt.*;
import javax.swing.*;

public class AppletIntro2 extends JApplet {
	double sum;
	
	public void init() {
		String fn = JOptionPane.showInputDialog("enter the first number");
		String sn = JOptionPane.showInputDialog("enter the second number");
		
		double n1 = Double.parseDouble(fn);
		double n2 = Double.parseDouble(sn);
		
		sum = n1 + n2;
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		
		g.drawString("the sum is " + sum, 25, 50);
	}
}