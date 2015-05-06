
public class TimeClass_Main{
	public static void main(String[] args){
		TimeClass timeClassObj = new TimeClass();
		
		System.out.println(timeClassObj.toMilitary());
		
		timeClassObj.setTime(5, 58, 20);
		
		System.out.println(timeClassObj.toMilitary());
	}
}