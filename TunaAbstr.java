
public class TunaAbstr extends FoodAbstr {
	public TunaAbstr () {
		setFood("tuna");
	}
	
	public void eat() {
		System.out.println("This " + foodName + " is delicious");
	}
}