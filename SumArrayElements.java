
public class SumArrayElements {
	public static void main(String[] args) {
		int tester[] = {34,51,112,5,25};
		int sum = 0;
		
		for (int counter = 0; counter<tester.length; counter++) {
			sum+=tester[counter];
		}
	System.out.println("The sum of all array element values is: " + sum);
	}
}
