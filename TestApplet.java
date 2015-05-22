import java.awt.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;


public class TestApplet extends JApplet {
	
	public void init() {
	try {
		URL url = new URL("http://www.google.com");
		AppletContext browser = getAppletContext();
		browser.showDocument(url);
		} 
		catch (MalformedURLException e) {
		}
	}
	
	
}
