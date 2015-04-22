
public class StaticExample {
	private String fName;
	private String lName;
	private static int membercount = 0;
	
	public StaticExample(String fn, String ln){
		fName = fn;
		lName = ln;
		membercount++;
		
		System.out.printf("This is the constructor for %s %s. The number of people in the party is %s\n", fName, lName, membercount);
	}
}
