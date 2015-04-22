import java.util.*;
import java.io.*;
import java.lang.*;

public class WriteToFile {

	private Formatter fileObj;
	// open/create file
	public void openFile() {
		try {
			fileObj = new Formatter("textfile.txt");
			System.out.println("file created and written to");
		} catch (Exception e) {
			System.out.println("error when opening file");
		}
	}
	
	// write to file 
	public void addRecord() {
		fileObj.format("%s %s", "Tester ", "Guy");
	}
	
	//close file
	public void closeFile() {
		fileObj.close();
	}
	
}
