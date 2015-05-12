import java.util.*;

public class CollectionsMethodSort {
	public static void main(String[] args) {
		// declare array of String objects
		String[] strArray = {"glass", "hair", "light", "chair", "table"};
		
		// declare List object and populate it with String objects of strArray
		List<String> list1 = new ArrayList<String>(Arrays.asList(strArray));
		
		// use sort() method of Collections class on list1
		Collections.sort(list1);
		
		// output results
		System.out.printf("%s ", list1);
		
		// new line;
		System.out.println();
		
		// use sort() method with Collections.reverseOrder() parameter
		Collections.sort(list1, Collections.reverseOrder());
		
		// output results
		System.out.printf("%s ", list1);
	}
}