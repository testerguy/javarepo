import javax.swing.*;

public class Adapter_Ex_Main {
	public static void main(String[] args) {
		Adapter_Ex adapterObj = new Adapter_Ex();
		
		adapterObj.setSize(400,400);
		adapterObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adapterObj.setVisible(true);
	}
}