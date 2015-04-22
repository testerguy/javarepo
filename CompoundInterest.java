
public class CompoundInterest {
	public static void main(String[] args) {
		double principal = 20000;
		double rate = 0.10;
		double amount;
		
		for (int year=1;year<=30;year++) {
			amount = principal * Math.pow(1+rate, year);
			System.out.println(amount);
		}
	}
	
	
}
