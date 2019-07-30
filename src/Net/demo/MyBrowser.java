package Net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyBrowser {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("java-网络编程-模拟一个浏览器获取信息");
		Socket s = new Socket("127.0.0.1",9090);

		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		out.println("GET /index.html HTTP/1.1");
		out.println("Accpet: */*");
		out.println("Host: 127.0.0.1:9090");
		out.println("Connection: close");
		out.println();
		out.println();
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println(text);
		
		s.close();
	}

}
