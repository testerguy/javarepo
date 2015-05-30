import java.io.IOException;
import java.net.*;


public class ExampleClass {
	ServerSocket server;
	Socket connection;
	
	public void startServer() {
		try {
     		server = new ServerSocket(3456, 10);
			while (true) {
				startConnection();
			}
		}			
		 catch (IOException ioException) {
			System.out.println("test");
			ioException.printStackTrace();
		}
	}
	
	public void startConnection() throws IOException {
		connection = server.accept();
	}
	
}
