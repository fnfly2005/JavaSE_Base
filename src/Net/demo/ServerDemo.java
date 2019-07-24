package Net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-TCP协议-服务端");
		ServerSocket ss = new ServerSocket(10002);
		
		Socket s = ss.accept();
		
		String  ip = s.getInetAddress().getHostAddress();
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		String text = new String(buf,0,len);
		
		System.out.println(ip + " server: " +text);
		
		s.close();
		
		ss.close();

	}

}
