
public enum Enumeration1{
	Jacklyn("sweet", "14"),
	Yoshi("hot", "20"),
	Eriko("smart", "28");
	
	private final String desc;
	private final String age;
	
	private Enumeration1(String description, String year){
		desc = description;
		age = year;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAge(){
		return age;
	}
}