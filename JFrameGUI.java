import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class JFrameGUI extends JFrame {
	private JLabel item1;
	
	public JFrameGUI() {
		super("title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentence");
		item1.setToolTipText("This is the hover over text");
		add(item1);
	}
}