
public class ArrayInMethod {
	public static void main(String[] args) {
		int tester[] = {4,5,6,7,8};
		
		change(tester);
		
		for (int x: tester)
			System.out.println(x);
	}
	
	public static void change (int x[]) {
		for (int counter = 0; counter<x.length; counter++) 
			x[counter]+=5;
	}
}
