import java.util.*;

public class HashSet_Ex {
	public static void main (String[] args) {
		// create Array of String objects and convert to List object
		String[] strArr = {"table", "car", "chicken", "table", "coffee"};
		
		List<String> l = new ArrayList<String>(Arrays.asList(strArr));
		
		// ouput 'l'
		
		System.out.printf("%s \n", l);
		
		// create HashSet object from List object
		
		Set<String> s = new HashSet<String>(l);
		
		//output set
		
		System.out.printf("%s ", s);
		
	}
}