package io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;


public class SplitFilesDemo {

	private static final int SIZE = 1048576;

	public static void main(String[] args) throws IOException {
		
		/**
		 * 思路：
		 * 1、需要一个输入流
		 * 2、需要指定文件大小
		 * 3、需要多个输出流
		 */
		
		
		File f1 = new File("/Users/fannian/Downloads/deltest/javatest.avi");
		File f2 = new File("/Users/fannian/Downloads/deltest/javatest-mr.avi");
		File dir = new File("/Users/fannian/Downloads/deltest");
		if (!dir.exists()){
			dir.mkdir();
		}
		
		SplitFileDemo(f1,dir);
		MegerFiledemo(f2,dir);

	}

	private static void MegerFiledemo(File f, File dir) throws IOException {
		System.out.println("java-IO流-文件合并");
		
		FileOutputStream fos = new FileOutputStream(f);
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		File[] files = dir.listFiles(new FilterSuffix(".part"));
		for (File file:files) {
			al.add(new FileInputStream(file));
		}
		Enumeration<FileInputStream> e = Collections.enumeration(al);
		SequenceInputStream sis = new SequenceInputStream(e);
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			fos.write(buf, 0, len);
		}
		fos.close();
		sis.close();
		
	}

	private static void SplitFileDemo(File f,File dir) throws IOException {
		System.out.println("java-IO流-文件切割");
		FileInputStream fis = new FileInputStream(f);
		
		
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
