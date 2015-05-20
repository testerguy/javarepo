import java.util.*;

public class Thread_Ex_Main {
	public static void main (String[] args) {
		Thread th1 = new Thread(new Thread_Ex("first thread"));
		Thread th2 = new Thread(new Thread_Ex("second thread"));
		Thread th3 = new Thread(new Thread_Ex("third thread"));
		Thread th4 = new Thread(new Thread_Ex("fourth thread"));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
	}
}