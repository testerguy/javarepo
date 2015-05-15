import java.util.*;

public class GenericReturnTypes {
	public static void main (String[] args) {
		
		System.out.println(max(12,58,9));
		System.out.println(max("keyboard","chair","zinc"));
	}
	
	public static <T extends Comparable<T>> T max(T a, T b, T c) {
		T maximum = a;
		
		if (b.compareTo(a) > 0)
			maximum = b;
		if (c.compareTo(b) > 0)
			maximum = c;
		
		return maximum;
	}
}