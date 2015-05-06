
public class WriteToFile_Main {
	public static void main (String[] args) {
		WriteToFile obj = new WriteToFile();
		
		obj.openFile();
		obj.addRecord();
		obj.closeFile();
	}
}