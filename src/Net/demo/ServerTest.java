package Net.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-TCP协议-练习-文本转换服务端");
		ServerSocket ss = new ServerSocket(10004);
		
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		
		while((line=bufIn.readLine())!=null) {
			System.out.println(line);
			out.println(line.toUpperCase());
		}
		
		s.close();
		ss.close();

	}

}
