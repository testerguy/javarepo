import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class DrawOval_Frame extends JFrame {
	DrawOval_Panel panelObj;
	JSlider sliderObj;
	
	public DrawOval_Frame() {
		super("Oval maker");
		
		panelObj = new DrawOval_Panel();
		panelObj.setBackground(Color.YELLOW);
		
		sliderObj = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
		sliderObj.setMajorTickSpacing(10);
		sliderObj.setPaintTicks(true);
		
		sliderObj.addChangeListener(
				new ChangeListener() {
					public void stateChanged (ChangeEvent e) {
						panelObj.setD(sliderObj.getValue());
					}
				}
		);
		
		add(panelObj, BorderLayout.CENTER);
		add(sliderObj, BorderLayout.SOUTH);
	}
}