import java.util.*;

public class ConvertListToArray {
	public static void main(String[] args) {
		// declare array of String objects
		String[] strArray = {"plant", "blinds", "speak", "wood", "door"};
		
		// declare LinkedList type collection and populate it with strArray String objects
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(strArray)); 
		
		// add some String objects to list1
		list1.addFirst("plastic");
	
		list1.add("glass");
		
		// convert list back into array
		strArray = list1.toArray(new String[list1.size()]);
		
		// run enhanced for loop to display each String object in strArray
		
		for (String x : strArray)
			System.out.printf("%s ",x);
	}
}
