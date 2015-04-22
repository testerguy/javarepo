
public class PolymorphicEx1 {
	public static void main(String[] args) {
		AnimalClass[] theList = new AnimalClass[2];
		
		Tiger tigerObj = new Tiger();
		Sheep sheepObj = new Sheep();
		
		theList[0] = tigerObj;
		theList[1] = sheepObj;
		
		for (AnimalClass a : theList) {
			a.noise();
		}
	}
	
}
