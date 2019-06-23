package io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) throws IOException {
		
		System.out.println("java-IO流-字节流-操作文件基本演示");
		demo_write();
		demo_read1();
		demo_read2();
		demo_read3();

	}


	private static void demo_read3() throws IOException {
		FileInputStream fis = new FileInputStream("copyfiletest1.txt");
		byte[] buf = new byte[fis.available()];//注意内存溢出情况
		int line = 0;
		
		while((line=fis.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,line));
		}
	}
	


	private static void demo_read2() throws IOException {
		FileInputStream fis = new FileInputStream("copyfiletest1.txt");
		byte[] buf = new byte[1024];
		int line = 0;
		
		while((line=fis.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,line));
		}
		
	}
	
	private static void demo_read1() throws IOException {
		FileInputStream fis = new FileInputStream("copyfiletest1.txt");
		int line = 0;
		
		while((line=fis.read())!=-1)
		{
			System.out.println((char)line);
		}
		
	}

	private static void demo_write() throws IOException{
		FileOutputStream fos = new FileOutputStream("copyfiletest1.txt");
		
		fos.write("abcdefg".getBytes());
		fos.close();
		
	}

	
}
