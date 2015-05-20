import java.util.*;

public class Thread_Ex implements Runnable {

	private String name;
	private Integer time;
	private Random r = new Random();
	
	public Thread_Ex(String s) {
		name = s;
		time = r.nextInt(999);
	}
	
	public void run() {
		try {
			System.out.printf("%s will sleep for %d ms\n", name, time);
			Thread.sleep(time);
			System.out.printf("%s woke up!\n", name);
		} catch (Exception e) {
		}
		
	}

}