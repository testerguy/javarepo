
public class MethodsInstances {
	private String girlfriend;
	public void setName(String name) {
		girlfriend = name;
	}
	public String getName() {
		return girlfriend;
	}
	public void saying() {
		System.out.println("My first gf's name was " + getName());
	}
}
