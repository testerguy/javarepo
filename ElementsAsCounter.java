import java.util.Random;

public class ElementsAsCounter {
	public static void main(String[] args){
		Random dice = new Random();
		
		int freq[] = new int[7];
		
		for (int face = 1; face<1000; face++){
			++freq[dice.nextInt(6) + 1];
		}
		
		System.out.println("face\tfrequency");
		
		for (int face = 1; face<freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
		}
	}
}
