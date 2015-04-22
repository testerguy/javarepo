import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Adapter_Ex extends JFrame {
	private String str;
	private JLabel statusBar;
	
	public Adapter_Ex() {
		statusBar = new JLabel("default value");
		
		add(statusBar, BorderLayout.SOUTH);
		
		addMouseListener(new MouseClass());
	}
	
	private class MouseClass extends MouseAdapter {
		public void mouseClicked(MouseEvent event) {
			str = String.format("this is click %d with a ", event.getClickCount());
			
			if (event.isMetaDown())
				str += "right click";
			else if (event.isAltDown())
				str += "center click";
			else
				str += "left click";
			
			statusBar.setText(str);
		}
	}
}
