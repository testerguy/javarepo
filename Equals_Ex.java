
public class Equals_Ex {
	public static void main(String[] args) {
		String a = "foo";
		String b = "bar";
		String c = "BAR";
		
		if (a.equals("foo")) 
			System.out.println("'a' is 'foo'");
		
		if (b.equalsIgnoreCase(c))
			System.out.println("the content of 'b' equals 'c' when case is ignored");
	}
}
