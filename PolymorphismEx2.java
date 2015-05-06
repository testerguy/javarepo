
public class PolymorphismEx2 {
	
	public static void main(String[] args) {
		int num = 2;
	
	    Food2 foodObj = new Food2();
	    Trout2 troutObj = new Trout2();
	    Almond almondObj = new Almond();
	    
	    Person amin = new Person();
	    
	    amin.eat(foodObj);
	    amin.eat(troutObj);
	    amin.eat(almondObj);
	}
	
}
