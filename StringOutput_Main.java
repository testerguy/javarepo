import java.util.Scanner;

public class StringOutput_Main {
	public static void main(String args[]) {
		Scanner inputvar = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		
		String name = inputvar.nextLine();
		
		StringOutput objvar = new StringOutput();
		
		objvar.simpleMessage(name);
	}
}
