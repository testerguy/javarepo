import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class HandlerExample extends JFrame {
	JTextField item1;
	JTextField item2;
	JTextField item3;
	JPasswordField passField;
	
	public HandlerExample() {
		super("text in title bar");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(20);
		add(item1);
		
		item2 = new JTextField("replace this", 20);
		add(item2);
		
		item3 = new JTextField("uneditable");
		item3.setEditable(false);
		add(item3);
		
		passField = new JPasswordField("dummypass");
		add(passField);
		
		HandlerClass handlerObj = new HandlerClass();
		
		item1.addActionListener(handlerObj);
		item2.addActionListener(handlerObj);
		item3.addActionListener(handlerObj);
		passField.addActionListener(handlerObj);
		
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent eventObj) {
			String formatstr = "";
			String actcmd = eventObj.getActionCommand();
			
			if (eventObj.getSource() == item1) {
				formatstr = "item 1 = ";
			} else if (eventObj.getSource() == item2) {
				formatstr = "item 2 = ";
			} else if (eventObj.getSource() == item3) {
				formatstr = "item 3 = ";
			} else if (eventObj.getSource() == passField) { 
				formatstr = "password field = ";
			}
			
			String str = String.format(formatstr + "%s", actcmd);
			
			JOptionPane.showMessageDialog(null,  str);
		}
	}
}