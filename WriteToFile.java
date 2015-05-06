import java.util.*;
import java.lang.*;
import java.io.*;

public class WriteToFile {
	
	private Formatter fileObj;
	
	// open/create file
	public void openFile() {
		try {
			fileObj = new Formatter("log.txt");
			System.out.println("file opened/created");
		} catch (Exception e) {
			System.out.println("file open failed");
		}
		
	}
	
	// add to file
	public void addRecord() {
		fileObj.format("%s %s", "Tester ", "Guy");
	}
	
	// close file
	public void closeFile() {
		fileObj.close();
	}
}