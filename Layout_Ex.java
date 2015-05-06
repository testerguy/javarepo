import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Layout_Ex extends JFrame {
	JButton lB, cB, rB;
	Container content;
	FlowLayout layout;
	
	public Layout_Ex() {
		super("layout program");
		
		layout = new FlowLayout();
		setLayout(layout);
		
		lB = new JButton("left");
		add(lB);
		
		cB = new JButton("center");
		add(cB);
		
		rB = new JButton("right");
		add(rB);
		
		content = getContentPane();
		
		lB.addActionListener(
				new ActionListener() {
					public void actionPerformed (ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						layout.layoutContainer(content);
					}
				}
		);
		cB.addActionListener(
				new ActionListener() {
					public void actionPerformed (ActionEvent event) {
						layout.setAlignment(FlowLayout.CENTER);
						layout.layoutContainer(content);
					}
				}
		);
		rB.addActionListener(
			new ActionListener() {
				public void actionPerformed (ActionEvent event) {
					layout.setAlignment(FlowLayout.RIGHT);
					layout.layoutContainer(content);
				}
			}
		);
	}
}