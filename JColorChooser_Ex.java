import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JColorChooser_Ex extends JFrame {
	JButton button;
	JPanel panel;
	Color color = Color.WHITE;
	
	public JColorChooser_Ex() {
		super("JColorChooser program");
		
		button = new JButton("change color");
		panel = new JPanel();
		panel.setBackground(color);
		
		button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					color = JColorChooser.showDialog(null, "Choose a color", color);
					if (color == null)
						color = Color.WHITE;
					panel.setBackground(color);
				}
			}	
		);
		
		add(panel, BorderLayout.CENTER);
		add(button, BorderLayout.SOUTH);
		
		setSize(450,400);
		setVisible(true);
	}
}