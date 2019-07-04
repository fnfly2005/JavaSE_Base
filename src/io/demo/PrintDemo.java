package io.demo;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo {

	public static void main(String[] args) throws IOException {
		show1();
		show2();

	}

	private static void show2() throws IOException {
		System.out.println("java-IO流-打印流-PrintWriter");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//实现对文件写入的自动刷新
		FileWriter f = new FileWriter("copyfiletest1.txt");
		PrintWriter pw = new PrintWriter(f,true);
		
		String line = null;
		while ((line=br.readLine())!=null)
		{
			if ("over".equals(line))
			{
				break;
			}
			pw.println(line.toUpperCase());
			
		}
		
		pw.close();
		br.close();
	}

	private static void show1() throws IOException {
		System.out.println("java-IO流-打印流-PrintStream");
		PrintStream ps = new PrintStream("copyfiletest1.txt");

		ps.write(609);//只写最低8位的内容字节
		ps.print(97);//保持原样
		ps.close();
	}

}
