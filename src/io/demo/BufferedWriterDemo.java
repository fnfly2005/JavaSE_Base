package io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-字符流-缓冲区-BufferedWriter");
		
		FileWriter fw = new FileWriter("filewriter_demo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (int i=0;i<4;i++)
		{
			bw.write("abcde" + i);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();

	}

}
