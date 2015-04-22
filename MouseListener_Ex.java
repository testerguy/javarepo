import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListener_Ex extends JFrame {
	JPanel panel;
	JLabel statusBar;
	
	public MouseListener_Ex () {
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		add(panel,BorderLayout.CENTER);
		
		statusBar = new JLabel("default value");
		add(statusBar,BorderLayout.SOUTH);
		
		HandlerClass theHandler = new HandlerClass();
		
		panel.addMouseListener(theHandler);
		panel.addMouseMotionListener(theHandler);
	}
	
	private class HandlerClass implements MouseListener, MouseMotionListener {
		public void mouseClicked (MouseEvent event) {
			statusBar.setText(String.format("the mouse clicked at %d %d", event.getX(), event.getY()));
			panel.setBackground(Color.BLUE);
		}
		
		public void mousePressed (MouseEvent event) {
			statusBar.setText("mouse pressed down");
		}
		
		public void mouseReleased (MouseEvent event) {
			statusBar.setText("mouse button released");
		}
		
		public void mouseEntered (MouseEvent event) {
			panel.setBackground(Color.BLACK);
		}
		
		public void mouseExited (MouseEvent event) {
			statusBar.setText("the mouse has left the building");
			panel.setBackground(Color.WHITE);
		}
		
		public void mouseMoved (MouseEvent event) {
			statusBar.setText("the mouse is on the move");
		}
		
		public void mouseDragged (MouseEvent event) {
			panel.setBackground(Color.GREEN);
		}
	}
}