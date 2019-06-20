package io.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest {

	private static final int BUFFER_SIZE = 1024;

	public static void main(String[] args)  { //throws FileNotFoundException, IOException
		//copy1();
		copy2();

	}

	private static void copy2() {
		System.out.println("java-IO流-字符流-练习-复制文本文件_2");
		FileReader fr = null;
		FileWriter fw = null;
		
		//创建一个临时容器，用于缓存读取到的字符
		char[] buf = new char[BUFFER_SIZE];
		
		int len = 0;
		
		try {
			fr = new FileReader("filewriter_demo.txt");
			fw = new FileWriter("copyfiletest1.txt");
			
			while((len=fr.read(buf))!=-1)
			{
				fw.write(new String(buf,0,len));
			}
		} catch (IOException e) {
			throw new RuntimeException("读写失败");
		}
		finally
		{
			if (fr != null && fw != null)
			{
				try {
					fr.close();
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					throw new RuntimeException("关闭失败");
				}
			}		
		}
	}

	private static void copy1() throws FileNotFoundException, IOException {
		System.out.println("java-IO流-字符流-练习-复制文本文件_1");
		FileReader fr = new FileReader("filewriter_demo.txt");
		FileWriter fw = new FileWriter("copyfiletest1.txt");
		int ch = 0;
		while ((ch=fr.read())!= -1)
		{
			char c = (char) ch;
			System.out.print(c);
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
