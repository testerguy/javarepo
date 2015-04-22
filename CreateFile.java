import java.util.*;

public class CreateFile {
	
	public static void main (String[] args) {
		final Formatter fileObj;
	
		try {
			fileObj = new Formatter("new file");
			System.out.println("file created");
		} catch (Exception e) {
			System.out.println("error");
		}
	}
}