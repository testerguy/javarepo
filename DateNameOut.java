
public class DateNameOut {
	private String fname;
	private DateOut today;
	
	public DateNameOut (String s, DateOut d){
		fname = s;
		today = d;
		
		System.out.printf("My name is %s and the date is %s\n", fname, today);
	}
}
