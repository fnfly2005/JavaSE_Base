package Net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("127.0.0.1", 10004);
		
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		BufferedReader burin = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			if("over".equals(line)) {
				break;
			}
			
			out.println(line);
			
			String upperStr = burin.readLine();
			
			System.out.println(upperStr);
			
		}
		
		s.close();

	}

}
