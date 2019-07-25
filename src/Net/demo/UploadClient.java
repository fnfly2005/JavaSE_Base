package Net.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("java-网络编程-TCP协议-练习-上传文本文件");
		Socket s = new Socket("127.0.0.1",10005);
		
		BufferedReader bufr = new BufferedReader(new FileReader("filelisttest.txt"));
		
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null) {
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}
		
		s.shutdownOutput();
		
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String str = bf.readLine();
		System.out.println(str);
		
		bufr.close();
		s.close();

	}

}
