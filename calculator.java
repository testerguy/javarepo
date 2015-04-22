import java.util.Scanner;

class calculator {
	public static void main(String args[]) {
		Scanner inputvar = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter first number: ");
		fnum = inputvar.nextDouble();
		System.out.println("Enter second number: ");
		snum = inputvar.nextDouble();
		answer = fnum + snum;
		System.out.println(answer);
	}
}