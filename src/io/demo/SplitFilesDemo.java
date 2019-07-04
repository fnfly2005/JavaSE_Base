package io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class SplitFilesDemo {

	private static final int SIZE = 1048576;

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-文件切割");
		/**
		 * 思路：
		 * 1、需要一个输入流
		 * 2、需要指定文件大小
		 * 3、需要多个输出流
		 */
		
		
		File f = new File("/Users/fannian/Downloads/javatest.avi");
		
		SplitFileDemo(f);

	}

	private static void SplitFileDemo(File f) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		
		File dir = new File("/Users/fannian/Downloads/deltest");
		if (!dir.exists()){
			dir.mkdir();
		}
		byte[] buf = new byte[SIZE];
		FileOutputStream fos = null;
		
		int len = 0;
		int count = 0;
		while ((len=fis.read(buf))!=-1)
		{
			count++;
			fos = new FileOutputStream(new File(dir,count+".part"));
			fos.write(buf, 0, len);			
		}
		
		fos.close();
		fis.close();
		
	}

}
