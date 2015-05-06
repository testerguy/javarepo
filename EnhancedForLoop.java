
public class EnhancedForLoop {
	public static void main(String[] args) {
		int tester[] = {102,1351,512421,12,56};
		int total = 0;
		
		for (int x : tester) {
			total += x;
		}
	
	System.out.println("total is: "+ total);
	}
}
