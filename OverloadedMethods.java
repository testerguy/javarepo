import java.util.*;

public class OverloadedMethods {
	public static void main(String[] args) {
		// declare Integer Array
		Integer[] iray = {1,2,3,4};
		
		// declare Character Array
		Character[] cray = {'a', 'b', 'c', 'd'};
		
		// output arrays with printMe()
		
		printMe(iray);
		printMe(cray);
	}
	
	public static void printMe(Integer[] a) {
		for (Integer x : a)
			System.out.printf("%s ", x);
		
		System.out.println();
	}
	
	public static void printMe(Character[] a) {
		for (Character x : a)
			System.out.printf("%s ", x);
		System.out.println();
	}
}
