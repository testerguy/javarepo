import java.util.*;

public class CollectionMethodFill {
	public static void main (String[] args) {
		// create array, convert it to list, and output
		Character[] charArr = {'p', 'w', 'n'};
		
		List<Character> l = new ArrayList<Character>(Arrays.asList(charArr));
		
		System.out.println("list: ");
		
		output(l);
		
		// reverse list and output
		Collections.reverse(l);
		
		System.out.println("reversed list: ");
		
		output(l);
		
		// create empty array and convert it to list and assign it to list variable
		
		Character[] emptyArr = new Character[l.size()];
		
		List<Character> copyList = new ArrayList<Character> (Arrays.asList(emptyArr));
		
		// copy 'l' list to 'copyList' list and output values of 'copyList' items
		
		Collections.copy(copyList,l);
		
		System.out.println("copied list: ");
		
		output(copyList);
		
		// fill 'l' list and output
		
		Collections.fill(l, 'X');
		
		System.out.println("filled list: ");
		
		output(l);
	}
	
	public static void output(List<Character> listObj) {
		// create array with length equal 'listObj'
		
		Character[] newArr = new Character[listObj.size()];
		
		// assign the values of items of 'listObj' List to 'newArr' elements
		
		newArr = listObj.toArray(new Character[listObj.size()]);
		
		// enhanced for loop
		
		for (Character c:  newArr)
			System.out.printf("%s ", c);
		
		System.out.println();
	}
}