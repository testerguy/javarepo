import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBox_Ex extends JFrame {
	JComboBox box;
	JLabel picture;
	String[] fileName = {"BlueFlare.png", "RedSphere.png"};
	Icon[] pics = {new ImageIcon(getClass().getResource(fileName[0])), new ImageIcon(getClass().getResource(fileName[1]))};
	
	public JComboBox_Ex() {
		super("the title");
		setLayout(new FlowLayout());
		
		box = new JComboBox(fileName);

		add(box);

		box.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent event) {
				if (event.getStateChange() == ItemEvent.SELECTED)
					picture.setIcon(pics[box.getSelectedIndex()]);
			}
		});
		
		picture = new JLabel(pics[0]);
		add(picture);
		
	}
}