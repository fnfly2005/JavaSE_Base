package io.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-字节流-练习-复制MP3");
		FileInputStream fis = new FileInputStream("D:\\DATA\\fannian\\Downloads\\streamdemo.mp4");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("D:\\DATA\\fannian\\Downloads\\streamdemo2.mp4");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int line = 0;
		while((line = bis.read()) != -1)
		{
			bos.write(line);
		}
		
		bis.close();
		bos.close();
	}

}
