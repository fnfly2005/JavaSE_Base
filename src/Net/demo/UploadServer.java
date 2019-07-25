package Net.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-TCP协议-练习-上传文本文件");
		
		ServerSocket ss = new ServerSocket(10005);
		
		Socket s = ss.accept();
		
		BufferedWriter bufw = new BufferedWriter(new FileWriter("uploadtest.txt"));
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		

		
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		
		pw.println("上传成功");
		
		bufw.close();
		s.close();
		ss.close();

	}

}
