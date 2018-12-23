import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;

public class HTTPServer {

	public static void main(String[] args) throws IOException {

		ServerSocket ser = new ServerSocket(8080);
		System.out.println("Listening on port 80...");
		
		while(true) {
			try(Socket cli = ser.accept()){
			String res = "HTTP/1.1 200 OK\r\n\r\n I will put something useful here?";
			cli.getOutputStream().write(res.getBytes("UTF-8"));
			}
		}
		
		
	}
	
}
