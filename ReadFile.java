import java.util.*;
import java.io.*;

public class ReadFile {
	
	private Scanner input;
	private String fileName = "textfile.txt";
	
	// open/create file
	
	public void openFile() {
		try {
			input = new Scanner(new File(fileName));
			System.out.println(String.format("%s opened/created", fileName));
		} catch (Exception e) {
			System.out.println("could not open file");
		}
	}
	
	// read file
	
	public void readFile() {
		while (input.hasNext()) {
			String a = input.next();
			String b = input.next();
			
			System.out.printf("%s %s\n",  a, b);
		}
	}
	
	// close scanner
	public void closeScanner() {
		input.close();
	}
}