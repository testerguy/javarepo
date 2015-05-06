import java.util.EnumSet;

public class EnumerationSet_Main {
	public static void main(String[] args){
		for (EnumerationSet person : EnumerationSet.values())
			System.out.printf("%s\t%s\t%s\n",person,person.getDesc(),person.getAge());
		
		System.out.println("\nNow for a ranged enum!\n");
		
		for (EnumerationSet person : EnumSet.range(EnumerationSet.Sarah, EnumerationSet.Eriko))
			System.out.printf("%s\t%s\t%s\n",person,person.getDesc(),person.getAge());
	}
}
