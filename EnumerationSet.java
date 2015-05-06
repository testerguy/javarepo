
public enum EnumerationSet {
	Jacklyn("loving","14"),
	Sarah("ass","16"),
	Yoshi("pretty","20"),
	Mariko("hot","22"),
	Eriko("smart","28"),
	Keiko("cute","28");
	
	private final String desc;
	private final String age;
	
	private EnumerationSet(String description, String years){
		desc = description;
		age = years;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String getAge(){
		return age;
	}
}
