import java.util.Scanner;

class SwitchStatement {
	public static void main (String args[]) {
		Scanner inputvars = new Scanner(System.in);
		
		System.out.println("enter age: ");
		
		int age = inputvars.nextInt();
		
		System.out.print("He is " + age + " so he can ");
		
		String ability;
		
		switch (age) {
		case 1: 
			ability = "walk";
			break;
		case 2:
			ability = "talk";
			break;
		case 3:
			ability = "hold a conversation";
			break;
		default:
			ability = "do something, but I'm not sure what";
			break;
		}
	System.out.println(ability);
	}
}