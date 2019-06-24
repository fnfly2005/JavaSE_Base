package io.demo;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyDemo {

	public static void main(String[] args) throws IOException {
		
		readKey();

	}

	private static void readKey() throws IOException {
		System.out.println("java-IO流-演示键盘录入");
		InputStream in  = System.in;
		
		int ch = in.read();//阻塞式方法
		System.out.println(ch);
		int ch1 = in.read();//阻塞式方法
		System.out.println(ch1);
		int ch2 = in.read();//阻塞式方法
		System.out.println(ch2);
	}

}
