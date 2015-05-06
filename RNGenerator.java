import java.util.Random;

public class RNGenerator {
	public static void main(String[] args){
		Random dice = new Random(); 
		
		int tempnum = 0;
		
		for (int counter = 0;counter<20;counter++){
			tempnum = dice.nextInt(20);
			System.out.println("Number: " + (1+tempnum));
		}
	}
}