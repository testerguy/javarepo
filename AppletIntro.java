import java.awt.*;
import javax.swing.*;

public class AppletIntro extends JApplet {
	
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawString("this is a string!", 25, 25);
	}
}