import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class DrawOval_Frame extends JFrame {
	DrawOval_Panel myPanel;
	JSlider mySlider;
	
	public DrawOval_Frame() {
		super("Oval maker");
		
		myPanel = new DrawOval_Panel();
		myPanel.setBackground(Color.YELLOW);
		
		mySlider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		mySlider.setMajorTickSpacing(10);
		mySlider.setPaintTicks(true);
		
		mySlider.addChangeListener(
			new ChangeListener() {
				public void stateChanged (ChangeEvent e) {
					myPanel.setD(mySlider.getValue());
				}
			}
		);
		
		
		
		add(myPanel, BorderLayout.CENTER);
		add(mySlider, BorderLayout.SOUTH);
	}
}