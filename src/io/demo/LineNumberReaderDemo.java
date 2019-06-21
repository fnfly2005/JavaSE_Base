package io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-字符流-缓冲区-LineNumberReader");
		FileReader fr = new FileReader("filewriter_demo.txt");
		LineNumberReader lnr = new LineNumberReader(fr);
		
		String line =null;
		lnr.setLineNumber(100);//设置起始行号
		while ((line=lnr.readLine())!=null)
		{
			System.out.println(lnr.getLineNumber() +":" + line); //打印行号和行
		}

		lnr.close();
	}

}
