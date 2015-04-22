
public class StaticExample2{
	private String fname;
	private String lname;
	public static int count = 0;
	
	public StaticExample2(String fn, String ln){
		fname = fn;
		lname = ln;
		count++;
		System.out.printf("This is the constructor for %s %s. The number of people is %s\n", fname, lname, count);
	}
	
}