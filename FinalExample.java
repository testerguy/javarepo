
public class FinalExample {
	private final int increment;
	
	private int sum = 0;
	
	public FinalExample(int a) {
		increment = a;
	}
	
	public void add() {
		sum += increment;
	}
	
	public String toString() {
		return String.format("sum: %s\n", sum);
	}
}