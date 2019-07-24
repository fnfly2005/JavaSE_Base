package Net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("java-网络编程-TCP协议-客户端");
		System.out.println("java-网络编程-TCP协议-服务端和客户端交互");
		Socket socket = new Socket("192.168.31.196",10002);
		
		OutputStream out = socket.getOutputStream();
		
		out.write("tcp演示：哥们又来了！".getBytes());
		
		InputStream in = socket.getInputStream();
		
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		System.out.println(text);
		
		socket.close();
		

	}

}
