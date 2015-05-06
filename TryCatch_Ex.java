import java.util.*;

public class TryCatch_Ex {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		boolean x = true;
		
		do {
			try {
				System.out.println("input first number");
				int a = input.nextInt();
				System.out.println("input second number");
				int b = input.nextInt();
				int c = a/b;
				System.out.println(c);
				x = false;
			} catch (Exception e) {
				System.out.println("input different numbers");
			}
		} while (x);
	}
}