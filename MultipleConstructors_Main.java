
public class MultipleConstructors_Main{
	public static void main(String[] args){
		MultipleConstructors timeObj = new MultipleConstructors();
		
		MultipleConstructors timeObj2 = new MultipleConstructors(4);
		
		MultipleConstructors timeObj3 = new MultipleConstructors(4, 29);
		
		MultipleConstructors timeObj4 = new MultipleConstructors(4, 29, 07);
		
		System.out.printf("%s \n", timeObj.toMilitary());
		
		System.out.printf("%s \n", timeObj2.toMilitary());
		
		System.out.printf("%s \n", timeObj3.toMilitary());
		
		System.out.printf("%s \n", timeObj4.toMilitary());
	}
}