
public class DateOut {
	private int year, month, day;
	
	public DateOut(int y, int m, int d){
		year = y;
		month = m;
		day = d;
		
		System.out.printf("The date is %s\n", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d",year,month,day);
	}
}
