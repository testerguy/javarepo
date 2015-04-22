import java.io.File;

public class File_Ex {
	public static void main (String[] args) {
		File fileO = new File("/home/aezic/IProute.txt");
		
		if (fileO.exists())
			System.out.println(fileO.getName()+ " exists");
		else
			System.out.println(fileO.getName()+ " doesn't exist");
	}
}