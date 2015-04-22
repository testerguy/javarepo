
public class ConstructorEx {
	private String girlName;
	public ConstructorEx(String name) {
		girlName = name;
	}
	public String getName(){
		return girlName;
	}
	public void saying() {
		System.out.println("Your girlfriend was " + getName());
	}
}