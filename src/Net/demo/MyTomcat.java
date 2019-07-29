package Net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-了解客户端和服务器端原理");
		ServerSocket ss = new ServerSocket(9090);
		Socket s = ss.accept();
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		
		System.out.println(text);
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("Hello World!");
		
		s.close();
		ss.close();
		

	}

}
