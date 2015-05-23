import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SimpleWebBrowser extends JFrame {
	JTextField addressBar;
	JEditorPane display;
	
	public SimpleWebBrowser() {
		addressBar = new JTextField("enter URL!");
		display = new JEditorPane();
		
		addressBar.addActionListener(
				new ActionListener() {
					public void actionPerformed (ActionEvent event) {
						// pass content of JTextField to loadData()
						loadData(event.getActionCommand());
					}
				}
		);
		
		add(addressBar, BorderLayout.NORTH);
		
		display.addHyperlinkListener(
				new HyperlinkListener() {
					public void hyperlinkUpdate(HyperlinkEvent event) {
						// if hyperlink ACTIVATED, pass it to loadData() and set 'addressBar' to it, both as String
						if (event.getEventType() == HyperlinkEvent.EventType.ACTIVATED) 
							loadData(event.getURL().toString());
					}
				}
		);
		
		add(new JScrollPane(display), BorderLayout.CENTER);
		
		setVisible(true);
		setSize(600,600);
	}
	
	private void loadData(String s) {
		// set 'display' to url in string
		try {
			display.setPage(s);
			addressBar.setText(s);
		} catch (Exception e) {
			System.out.println("not valid URL!");
		}
	}
}