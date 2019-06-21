package io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("filewriter_demo.txt");
		
		//read1(fr);
		read2(fr);
	}

	private static void read2(FileReader fr) throws IOException  {
		System.out.println("java-IO流-字符流-缓冲区-自定义MyBufferedReader-readLine方法");
		MyBufferedReader br = new MyBufferedReader(fr);
		
		String line = null;
		while((line = br.myReadLine())!=null)
		{
			System.out.println(line);
		}
		br.myClose();
		
	}

	private static void read1(FileReader fr) throws IOException {
		System.out.println("java-IO流-字符流-缓冲区-BufferedReader");
		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
	}

}
