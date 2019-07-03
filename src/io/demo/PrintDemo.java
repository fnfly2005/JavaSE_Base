package io.demo;

import java.io.IOException;
import java.io.PrintStream;

public class PrintDemo {

	public static void main(String[] args) throws IOException {
		show1();

	}

	private static void show1() throws IOException {
		System.out.println("java-IO流-打印流-PrintStream");
		PrintStream ps = new PrintStream("copyfiletest1.txt");

		ps.write(609);//只写最低8位的内容字节
		ps.print(97);//保持原样
		ps.close();
	}

}
