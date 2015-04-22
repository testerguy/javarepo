																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
public class Enumeration1_Main {
	public static void main(String[] args){
		
		for (Enumeration1 person : Enumeration1.values()){
			System.out.printf("%s\t%s\t%s\n", person, person.getDesc(), person.getAge());
		}
	}
}
