
abstract public class FoodAbstr {
	
	String foodName = "generic food";
	
	void setFood(String s) {
		foodName = s;
	}
	
	public abstract void eat();
}
