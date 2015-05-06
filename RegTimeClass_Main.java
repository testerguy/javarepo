
public class RegTimeClass_Main {
	public static void main(String[] args) {
		RegTimeClass timeObj = new RegTimeClass();
		
		timeObj.setTime(14, 25, 40);
		System.out.println(timeObj.toMilitary());
		System.out.println(timeObj.toRegular());
	}
}
