import java.util.*;

public class Collections_Ex2 {
	public static void main (String[] args) {
		// create array of String objects
		String[] strArray1 = {"rain", "fire", "water", "earth"};
		
		// create List type collection of String objects
		List<String> list1 = new ArrayList<String>();
		
		// assign array elements to List type collection
		for (String x: strArray1)
			list1.add(x);
		
		// repeat process for second array and List type collection
		
		String[] strArray2 = {"water", "earth"};
		
		List<String> list2 = new ArrayList();
		
		for (String x: strArray2)
			list2.add(x);
		
		// display objects of first List type collection
		for (int i = 0; i<list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
		
		
		// run editList() method
		editList(list1, list2);
		
		// create a line
		System.out.println();
		
		// display objects of first List type collection again
		for (int i = 0; i<list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
	}
	
	public static void editList(Collection<String> l1, Collection<String> l2) {
		// create iterator of String type objects for first List type collection
		Iterator<String> it = l1.iterator();
		
		while (it.hasNext()) {
			if (l2.contains(it.next()))
				it.remove();
		}
	}
}