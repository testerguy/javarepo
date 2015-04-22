import javax.swing.JFrame;

public class HandlerExample_Main {
	public static void main(String[] args) {
		HandlerExample testObj = new HandlerExample();
		
		testObj.setSize(300,100);
		testObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testObj.setVisible(true);
	}
}