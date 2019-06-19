package io.demo;

import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader f1 = new FileReader("filewriter_demo.txt");
		show1(f1);
		f1.close();
		FileReader f2 = new FileReader("filewriter_demo.txt");
		show2(f2);
		f2.close();
		

	}

	private static void show2(FileReader f) throws IOException {
		System.out.println("java-IO流-字符流-FileReader-读取方式二");
		char[] buf = new char[1024];
		while (f.read(buf)!=-1)
		{
			System.out.println(new String(buf));//使用字符数组生成字符串
		}
		
	}

	private static void show1(FileReader f) throws IOException {
		System.out.println("java-IO流-字符流-FileReader-读取方式一");
		int i =0;
		while (i!=-1)
		{
			i = f.read();
			char c = (char) i;
			System.out.print(c);
		}
	}

}
