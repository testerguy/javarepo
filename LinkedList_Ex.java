import java.util.*;

public class LinkedList_Ex {
	public static void main(String[] args) {
		// create array of String objects
		String[] strArr1 = {"tree", "rain", "fire", "earth", "stone", "gold"};
		
		// create List type collection for String objects
		List<String> list1 = new LinkedList();
		
		// add String objects in array to List type collection
		for (String x : strArr1)
			list1.add(x);
		
		// create second array of String ojects
		String[] strArr2 = {"silver", "bronze", "grain", "fruit", "milk"};
		
		// create second List type collection for String objects
		List<String> list2 = new LinkedList();
		
		// add String objecets of second array to second List type collection
		for (String x : strArr2)
			list2.add(x);
		
		// add the second List type collection to the first
		
		
	}
}
