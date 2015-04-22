
public class WriteToFile_Main {
	
	public static void main (String[] args) {
		WriteToFile o = new WriteToFile();
	
		o.openFile();
		o.addRecord();
		o.closeFile();
	}
}
