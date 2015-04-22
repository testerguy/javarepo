import java.util.Scanner;

public class WhiteLoop {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputvars = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		
		int counter = inputvars.nextInt();
		
		while (counter < 10) {
			System.out.println("this is number " + counter++);
		}

	}

}
