
public class Factorial_Ex {
	public static void main(String[] args) {
		System.out.println(fact(8));
	}
	
	public static long fact(long n) {
		if (n <= 1)
			return 1;
		else {
			return n * fact(n-1);
		}
	}
}