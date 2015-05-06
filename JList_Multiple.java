import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class JList_Multiple extends JFrame {
	
	String[] cities = {"Vancouver", "Seattle", "Portland", "San Francisco", "LA", "San Diego"};
	
	JList rightList;
	JList leftList;
	
	JButton moveButton;
	
	public JList_Multiple () {
		super("title bar");
		setLayout(new FlowLayout());
		
		leftList = new JList(cities);
		
		leftList.setVisibleRowCount(4);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		add(new JScrollPane(leftList));
		
		moveButton = new JButton("move -->");
		
		add(moveButton);
		
		rightList = new JList();
		
		moveButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent event) {
				rightList.setListData(leftList.getSelectedValues());
			}
		});
		
		rightList.setVisibleRowCount(6);
		rightList.setFixedCellWidth(160);
		rightList.setFixedCellHeight(15);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		add(new JScrollPane(rightList));
	}
	
}
