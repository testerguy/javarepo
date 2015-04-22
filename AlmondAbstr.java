
public class AlmondAbstr extends FoodAbstr {
	public AlmondAbstr () {
		setFood("almond");
	}
	
	public void eat() {
		System.out.println("This " + foodName + " is delicious");
	}
}
