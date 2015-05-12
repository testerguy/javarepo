import java.util.*;

public class CollectionMethodFill {
	public static void main (String[] args) {
		// create Character array and assign objects to newly created List, then output List objects
		Character[] ray = {'p', 'w', 'n'};
		
		List<Character> l = new ArrayList<Character>(Arrays.asList(ray));
		
		output(l);
		
		// reverse List and ouput
		Collections.reverse(l);
		output(l);
		
		// create empty Array and create a List object that is a conversion of it
		Character[] emptyRay = new Character[3];
		
		List<Character> listCopy = new ArrayList<Character>(Arrays.asList(emptyRay));
		
		// copy l to listCopy and output listCopy
		Collections.copy(listCopy, l);
		output(listCopy);
		
		// use fill() method of Collections class to fill 'l' List with 'X' Character objects, then output
		Collections.fill(l, 'X');
		output(l);
	}
	
	// declare output() method
	private static void output(List listObj) {
		Character[] arrayObj =  new Character[listObj.size()];
		
		
		
	}
}

