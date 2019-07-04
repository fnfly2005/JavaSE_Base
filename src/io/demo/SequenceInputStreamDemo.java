package io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-序列流-SequenceInputStream");
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		
		v.add(new FileInputStream("copyfiletest1.txt"));
		v.add(new FileInputStream("filelisttest.txt"));
		v.add(new FileInputStream("filewriter_demo.txt"));
		
		Enumeration<FileInputStream> e = v.elements();
		SequenceInputStream sis = new SequenceInputStream(e);
		
		FileOutputStream fos = new FileOutputStream("SequenceInputStreamDemo.txt");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			fos.write(buf, 0, len);
		}
		
		sis.close();
		fos.close();

	}

}
