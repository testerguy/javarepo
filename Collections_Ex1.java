import java.util.*;

public class Collections_Ex1 {
	public static void main(String[] args) {
		
		// create array of String objects
		String[] strArray1 = {"rain", "fire", "water", "earth"};
		
		// create List type collection of String objects
		List<String> list1 = new ArrayList<String>();
		
		// assign array objects to List type collection
		for (String a : strArray1)
			list1.add(a);
		
		// repeat process for second array and List type collection
		
		String[] strArray2 = {"water", "earth"};
		
		List<String> list2 = new ArrayList();
		
		for (String b : strArray2)
			list2.add(b);
		
		// display all objects in first List type collection
		for (int i = 0; i<list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
	}
}