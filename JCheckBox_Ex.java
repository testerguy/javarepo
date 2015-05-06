import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JCheckBox_Ex extends JFrame {
	JTextField textField;
	JCheckBox boldBox;
	JCheckBox italicBox;
	
	public JCheckBox_Ex () {
		super("insert title bar text here");
		setLayout(new FlowLayout());
		
		textField = new JTextField("modifiable sentence", 20);
		textField.setFont(new Font("Serif",Font.PLAIN, 14));
		add(textField);
		
		boldBox = new JCheckBox("bolden");
		add(boldBox);
		
		italicBox = new JCheckBox("italicize");
		add(italicBox);
		
		HandlerT handler = new HandlerT();
		
		boldBox.addItemListener(handler);
		italicBox.addItemListener(handler);
	}
	
	private class HandlerT implements ItemListener {
		public void itemStateChanged(ItemEvent event) {
			int fontWeight = Font.PLAIN;
			int fontStyle = Font.PLAIN;
			int fontSize = 14;
			String fontType = "Serif";
			
			Font fontObj;
			
			if (boldBox.isSelected()) {
				fontWeight = Font.BOLD;
			}
			if (italicBox.isSelected()) {
				fontStyle = Font.ITALIC;
			}
			
			fontObj = new Font(fontType, fontWeight + fontStyle, fontSize);
			textField.setFont(fontObj);
			
		}
	}
}