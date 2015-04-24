
public class ReadFile_Main {
	public static void main (String[] args) {
		ReadFile fileObj = new ReadFile();
		
		fileObj.fileOpen();
		fileObj.fileRead();
		fileObj.fileClose();
	}
}