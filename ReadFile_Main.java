
public class ReadFile_Main {
	public static void main (String[] args) {
		ReadFile readObj = new ReadFile();
		
		readObj.openFile();
		readObj.readFile();
		readObj.closeScanner();
	}
}
