import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class GUIClass extends JFrame {
	JButton reg;
	JButton custom;
	
	public GUIClass() {
		super("title bar");
		setLayout(new FlowLayout());
		
		reg = new JButton("regular button");
		add(reg);
		
		Icon imageA = new ImageIcon(getClass().getResource("BlueFlare.png"));
		Icon imageB = new ImageIcon(getClass().getResource("RedSphere.png"));
		
		custom = new JButton("custom button", imageA);
		custom.setRolloverIcon(imageB);
		
		add(custom);
		
		HandlerClass theHandler = new HandlerClass();
		
		reg.addActionListener(theHandler);
		custom.addActionListener(theHandler);
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(null, event.getActionCommand());
		}
	}
}