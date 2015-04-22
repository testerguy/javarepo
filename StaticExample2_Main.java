
public class StaticExample2_Main {
	public static void main(String[] args){
		StaticExample2 member1 = new StaticExample2("Megan", "Fox");
		StaticExample2 member2 = new StaticExample2("Natalie", "Portman");
		StaticExample2 member3 = new StaticExample2("Kat","Dennings");
		StaticExample2 member4 = new StaticExample2("Tester", "Guy");
		
		System.out.println("The number of people in at the club is " + StaticExample2.count);
	}
}
