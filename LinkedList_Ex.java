import java.util.*;

public class LinkedList_Ex {
	public static void main(String[] args) {
		// declare array of String objects
		String[] strArr1 = {"wind", "rain", "fire", "earth"};
		
		// declare List type collection for String objects
		List<String> list1 = new LinkedList();
		
		// populate List type collection with String objects stored in array elements
		for (String x : strArr1)
			list1.add(x);
		
		// repeat for second array and List type collection
		
		String[] strArr2 = {"steel", "gold", "silver", "bronze"};
		
		List<String> list2 = new LinkedList();
		
		for (String x : strArr2)
			list2.add(x);
		
		// second list to first list
		list1.addAll(list2);
		
		list2 = null;
		
		// print list 1
		printList(list1);
		
		// remove two objects of first List type collection
		removeObjs(list1, 2, 5);
		
		// print list 1 again
		printList(list1);
		
		// print List type collection in reverse
		reverseList(list1);
	}
	
	public static void printList(List l1) {
		for (int i = 0; i < l1.size(); i++)
			System.out.printf("%s ", l1.get(i));
		System.out.println();
	}
	
	public static void removeObjs(List l1, int a, int b) {
		l1.subList(a, b).clear();		
	}
	
	public static void reverseList(List l1) {
		// declare Linked List iterator
		ListIterator<String> it = l1.listIterator(l1.size());
		
		while (it.hasPrevious()) {
			System.out.printf("%s ", it.previous());
		}
	}
}