package io.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-字符流-缓冲区-BufferedReader");
		FileReader fr = new FileReader("filewriter_demo.txt");

		BufferedReader br = new BufferedReader(fr);
		
		String line = null;
		while((line = br.readLine())!=null)
		{
			System.out.println(line);
		}
		br.close();
	}

}
