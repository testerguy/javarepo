import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JList_Ex extends JFrame {
	
	String[] colorNames = {"White", "Red", "Blue", "Yellow"};
	Color[] colors = {Color.WHITE, Color.RED, Color.BLUE, Color.YELLOW};
	
	JList list;
	
	public JList_Ex () {
		super("title bar");
		setLayout(new FlowLayout());
		
		list = new JList(colorNames);
		
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		add(new JScrollPane(list));
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged (ListSelectionEvent event) {
				getContentPane().setBackground(colors[list.getSelectedIndex()]);
			}
		});
	}
}