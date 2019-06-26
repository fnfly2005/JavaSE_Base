package io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		trans1();
		
		/**
		 * 需求1 将键盘录入的数据写入到一个文件中
		 * 需求2 将一个文本文件内容显示在控制台上
		 * 需求3 将一个文件中的内容复制到另一个文件中
		 */
		trans2(System.in,new FileOutputStream("filewriter_demo.txt"));
		trans2(new FileInputStream("filewriter_demo.txt"),System.out);
		trans2(new FileInputStream("filewriter_demo.txt"),new FileOutputStream("copyfiletest1.txt"));
	}
	private static void trans2(InputStream ins, OutputStream fos) throws IOException {
		System.out.println("java-IO流-需求演示");
		String ch = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(ins));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		while((ch=br.readLine())!=null)
		{
			if("over".equals(ch))
				break;
			bw.write(ch.toUpperCase());
			bw.newLine();
			bw.flush();
		}
	}
	private static void trans1() throws IOException {
		System.out.println("java-IO流-转换流");
		String ch = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while((ch=br.readLine())!=null)
		{
			if("over".equals(ch))
				break;
			bw.write(ch.toUpperCase());
			bw.newLine();
			bw.flush();
		}
	}

}
