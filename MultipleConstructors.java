
public class MultipleConstructors {
	private int hour, minute, second;
	
	MultipleConstructors(){
		this(0,0,0);
	}
	
	MultipleConstructors(int h){
		this(h,0,0);
	}
	
	MultipleConstructors(int h, int m){
		this(h,m,0);
	}
	
	MultipleConstructors(int h, int m, int s){
		setTime(h,m,s);
	}
	
	public void setTime(int h, int m, int s){
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	private void setHour(int val){
		hour = (val>=0 || val<24) ? val : 0;
	}
	
	private void setMinute(int val){
		minute = (val>=0 || val<60) ? val : 0;
	}
	
	private void setSecond(int val){
		second = (val>=0 || val<60) ? val : 0;
	}
	
	private int getHour(){
		return hour;
	}
	
	private int getMinute(){
		return minute;
	}
	
	private int getSecond(){
		return second;
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
}