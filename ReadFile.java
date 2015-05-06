import java.util.*;
import java.io.*;

public class ReadFile {
	Scanner input;
	String file = "textfile.txt";
	
	// initialize Scanner object with anonymous File object
	public void fileOpen () {
		try {
			input = new Scanner(new File(file));
			System.out.println("file created");
		} catch (Exception e) {
			System.out.println("file could not be created");
		}
	}
	
	// read File being scanned by Scanner object
	public void fileRead() {
		String a, b;
		
		while (input.hasNext()) {
			a = input.next();
			b = input.next();
			System.out.printf("%s %s\n", a, b);
		}
	}
	
	// close Scanner object
	public void fileClose() {
		input.close();
	}
}