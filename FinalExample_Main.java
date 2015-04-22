import java.util.Scanner;

public class FinalExample_Main {
	public static void main(String[] args) {
		Scanner inputObj = new Scanner(System.in);
		
		System.out.println("input increment value");
		
		int increment = inputObj.nextInt();
		
		System.out.println("input number of increment rounds");
		
		int rounds = inputObj.nextInt();
		
		FinalExample finalObj = new FinalExample(increment);
		
		for (int i = 0; i < rounds; i++) {
			finalObj.add();
			System.out.printf("%s", finalObj);
		}
	}
}