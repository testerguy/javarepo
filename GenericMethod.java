import java.util.*;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] iray = {1,2,3,4};
		
		Character[] cray = {'a','b','c','d'};
		
		printMe(iray);
		printMe(cray);
	}
	
	public static <T> void printMe(T[] x) {
		for (T e : x)
			System.out.printf("%s ", e);
		System.out.println();
	}
}
