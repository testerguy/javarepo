import java.util.Scanner;

public class MethodsInstances_Main {
	public static void main(String args[]) {
			Scanner inputvar = new Scanner(System.in);
			
			System.out.println("Enter your first girlfriend's name: ");
			
			String temp = inputvar.nextLine();
			
			MethodsInstances objvar = new MethodsInstances();
			
			objvar.setName(temp);
			
			objvar.saying();
	}
}
