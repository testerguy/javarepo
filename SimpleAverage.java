import java.util.Scanner;

public class SimpleAverage {
	public static void main(String[] args) {
		int total = 0;
		int grade;
		int average;
		int counter = 0;
		
		Scanner inputvar = new Scanner(System.in); 
		
		while (counter < 10) {
			grade = inputvar.nextInt();
			total += grade;
			counter++;
		}
		
		average = total/counter;
		System.out.println("The average grade is " + average);
	}
}
