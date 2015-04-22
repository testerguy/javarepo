
public class PolymorphismEx1 {
	public static void main(String[] args) {
		
		int num = 2;
		
		Food foodObj[] = new Food[num];
		
		foodObj[0] = new Trout();
		foodObj[1] = new ChickenBreast();
		
		for (int i = 0; i<num; i++) {
			foodObj[i].eat();
		}
		
	}
}