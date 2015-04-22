
public class InheritanceExample_Food {

	public String fooditem; 
	
	public void foodctor(String s) {
		fooditem = s;
	}
		
	public void eat() {
		System.out.printf("I eat %s\n",fooditem);
	}
}
