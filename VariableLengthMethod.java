
public class VariableLengthMethod{
	public static void main(String[] args){
		System.out.println(average(123,51,32,51,28));
	}
	public static int average(int...numbers){
		int total = 0;
		for (int x : numbers)
			total+=x;
		return total/numbers.length;
	}
}