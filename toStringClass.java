
public class toStringClass {
	private int year, month, day;
	
	public toStringClass(int y, int m, int d){
		year = y;
		month = m;
		day = d;
		
		System.out.printf("The constructor created %s", this);
	}
	
	public String toString(){
		return String.format("%d/%d/%d", year, month, day);
	}
}
