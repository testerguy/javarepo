import java.util.*;

public class Stack_Push_Pop {
	public static void main (String[] args) {
		Stack<String> stackObj = new Stack<String>();
		
		stackObj.push("bottom");
		stackObj.push("second");
		stackObj.push("third");
		stackObj.push("fourth");
		
		printStack(stackObj);
		
		// pop items off and print stack items after each pop
		
		stackObj.pop();
		printStack(stackObj);
		
		stackObj.pop();
		printStack(stackObj);
		
		stackObj.pop();
		printStack(stackObj);
		
		stackObj.pop();
		printStack(stackObj);
		
	}
	
	public static void printStack(Stack<String> s) {
		if (s.isEmpty())
			System.out.println("stack is empty!");
		else {
			System.out.printf("%s TOP", s);
			System.out.println();
		}
	}
}
