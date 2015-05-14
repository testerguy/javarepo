import java.util.*;

public class AddAll {
	public static void main (String[] args) {
		// create array and convert to list
		String[] strArr = {"fern", "elm", "spruce"};
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(strArr));
		
		// create list and add items via Collections::add() method
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("mouse");
		
		list2.add("processor");
		
		list2.add("mouse");
		
		// add 'strArray' elements to 'list2' as list items
		
		Collections.addAll(list2, strArr);
		
		// output with enhanced for loop
		
		for (String x : list2)
			System.out.printf("%s ", x);
		
	}
}