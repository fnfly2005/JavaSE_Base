package io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-转换流的编码解码");
		write();
		read();
	}

	private static void read() throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("filewriter_demo.txt"),"UTF-8");
		char[] buf = new char[10];
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		isr.close();
	}

	private static void write() throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("filewriter_demo.txt"),"UTF-8");		
		osw.write("你好");
		osw.close();
	}

}
