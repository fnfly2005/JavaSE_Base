package Net.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("java-网络编程-TCP协议-客户端");
		Socket socket = new Socket("192.168.31.196",10002);
		
		OutputStream out = socket.getOutputStream();
		
		out.write("tcp演示：哥们又来了！".getBytes());
		
		socket.close();
		

	}

}
