import java.awt.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;

public class beginnetworking extends JApplet {
	private ArrayList<String> titles;
	private JList mainList;
	private HashMap<String, URL> websiteInfo;
	
	public void init() {
		titles = new ArrayList<String>();
		websiteInfo = new HashMap<String, URL>();
		
		getWebsiteInfo();
		
		mainList = new JList(titles.toArray());
		
		add(new JLabel("Please select a website"), BorderLayout.NORTH);
		
		mainList.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent e) {
						Object obj = mainList.getSelectedValue();
						URL url = websiteInfo.get(obj);
						AppletContext browser = getAppletContext();
						browser.showDocument(url);
					}
				}
		);
		
		add(new JScrollPane(mainList), BorderLayout.CENTER);
	}
	
	public void getWebsiteInfo() {
		String title;
		String address;
		URL url;
		
		Integer counter = 0;
		
		title = getParameter("title"+counter);
		
		while (title != null) {
			try {
				address = getParameter("address"+counter);
				url = new URL(address);
				websiteInfo.put(title, url);
				titles.add(title);
			} catch (MalformedURLException mue) {
				mue.printStackTrace();
			}
			counter++;
		}
	}
}