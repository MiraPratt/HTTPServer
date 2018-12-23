import java.net.ServerSocket;
import java.net.Socket;
import java.io.IOException;
import java.io.PrintWriter;

public class HTTPServer {

	public static void main(String[] args) throws IOException {

		ServerSocket ser = new ServerSocket(1025);
		System.out.println("Listening on port 1025...");
		
		while(true) {
			try(Socket cli = ser.accept()){
			String res = "HTTP/1.1 200 OK\r\n\r\n    _______________________-------------------                       `\\\n" + 
					" /:--__                                                              |\n" + 
					"||< > |                                   ___________________________/\n" + 
					"| \\__/_________________-------------------                         |\n" + 
					"|                                                                  |\n" + 
					" |                       THE LORD OF THE RINGS                      |\n" + 
					" |                                                                  |\n" + 
					" |      \"Three Rings for the Elven-kings under the sky,             |\n" + 
					"  |        Seven for the Dwarf-lords in their halls of stone,        |\n" + 
					"  |      Nine for Mortal Men doomed to die,                          |\n" + 
					"  |        One for the Dark Lord on his dark throne                  |\n" + 
					"  |      In the Land of Mordor where the Shadows lie.                 |\n" + 
					"   |       One Ring to rule them all, One Ring to find them,          |\n" + 
					"   |       One Ring to bring them all and in the darkness bind them   |\n" + 
					"   |     In the Land of Mordor where the Shadows lie.                |\n" + 
					"  |                                              ____________________|_\n" + 
					"  |  ___________________-------------------------                      `\\\n" + 
					"  |/`--_                                                                 |\n" + 
					"  ||[ ]||                                            ___________________/\n" + 
					"   \\===/___________________--------------------------\"";
			cli.getOutputStream().write(res.getBytes("UTF-8"));
			}
		}
		
		
	}
	
}
