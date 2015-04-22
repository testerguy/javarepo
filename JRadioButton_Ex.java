import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRadioButton_Ex extends JFrame {
	JTextField textField;
	JRadioButton pRadio;
	JRadioButton bRadio;
	JRadioButton iRadio;
	JRadioButton biRadio;
	
	Font pf = new Font("Serif", Font.PLAIN, 14);
	Font bf = new Font("Serif", Font.BOLD, 14);
	Font itf = new Font("Serif", Font.ITALIC, 14);
	Font bif = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
	
	public JRadioButton_Ex() {
		super("title bar text");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Tester is great", 20);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		
		add(textField);
		
		pRadio = new JRadioButton("plain",true);
		add(pRadio);
		
		bRadio = new JRadioButton("bold",false);
		add(bRadio);
		
		iRadio = new JRadioButton("italic",false);
		add(iRadio);
		
		biRadio = new JRadioButton("bold and italic",false);
		add(biRadio);
		
		pRadio.addItemListener(new HandlerT(pf));
		bRadio.addItemListener(new HandlerT(bf));
		iRadio.addItemListener(new HandlerT(itf));
		biRadio.addItemListener(new HandlerT(bif));
		
		ButtonGroup groupObj = new ButtonGroup();
		
		groupObj.add(pRadio);
		groupObj.add(bRadio);
		groupObj.add(iRadio);
		groupObj.add(biRadio);
	}
	
	private class HandlerT implements ItemListener {
		
		Font fontObj;
		
		public HandlerT(Font f) {
			fontObj = f;
		}
		
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(fontObj);
		}
	}
}
