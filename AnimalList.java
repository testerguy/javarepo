
public class AnimalList {
	
	private int num = 5;
	
	private Animal[] animalList = new Animal[num];
	
	private int i = 0;
	
	void add(Animal a) {
		if (i < num) {
			animalList[i] = a;
			System.out.println("The object was added at index " + i);
			i++;
		}
	}
}