import java.util.*;

public class Frequency_and_Disjoint {
	public static void main(String[] args) {
		// create array and convert it to list
		String[] strArr = {"elm", "spruce", "maple"};
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(strArr));
		
		// create ArrayList and add objects via Collections::add() method
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("mouse");
		list2.add("LCD");
		list2.add("processor");
		
		// add 'strArr' array elements to 'list2' as List items
		Collections.addAll(list2, strArr);
		
		// output
		
		for (String x: list2)
			System.out.printf("%s ", x);
		
		System.out.println();
		
		// output number of elements that match with String contained in 's' variable with Collections.frequency() method
		
		String s = "spruce";
		
		System.out.println("There is(are) "+Collections.frequency(list2, s)+" object(s) that matches(match) with '" + s + "'");
		
		// see if there are no objects in 'list1' that match the objects in 'list2' 
		
		Boolean tof = Collections.disjoint(list1, list2);
		
		if (tof)
			System.out.println("the two lists have no items with matching values");
		else
			System.out.println("the two lists have at least one matching object");
	}
}
