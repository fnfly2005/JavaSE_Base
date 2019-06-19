package io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterIOExceptionDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		System.out.println("java-IO流-字符流-FileWriter-IO异常处理");
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("/k/filewriterioexceptiondemo.txt");
			
			fw.write("Hello World"+ LINE_SEPARATOR);
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			if (fw != null)
			{
				try {
					fw.close();
				} catch (IOException e) {
					throw new RuntimeException("关闭失败");
				}
			}
		}
		
 
	}

}
