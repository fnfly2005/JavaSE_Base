package io.demo;

import java.io.IOException;
import java.io.InputStream;

public class ReadKeyDemo {

	public static void main(String[] args) throws IOException {
		
		readKey1();
		readKey2();
	}

	private static void readKey2() throws IOException {
		System.out.println("java-IO流-读取键盘录入");
		/**
		 * 获取用户键盘录入的数据
		 * 并将数据变成大写显示在控制台上
		 * 如果用户输入的是over 结束键盘录入
		 * 思路
		 * 1、因为键盘录入只读取一个字节，要判断是否是over,需要将读取到的字节拼成字符串
		 * 2、那就需要一个容器。容器的长度不确定，所以选择StringBuilder
		 * 3、在用户回车之前将录入的数据变成字符串判断即可
		 */
		InputStream in  = System.in;
		StringBuilder sb = new StringBuilder();
		int ch =0;
		while((ch=in.read())!=-1)
		{
			if (ch=='\r')
			{
				continue;
			}
			if(ch == '\n')
			{
				String temp = sb.toString();
				if("over".equals(temp))
				{	
					break;
				}
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else {
				sb.append((char)ch);
			}

		}
	}

	private static void readKey1() throws IOException {
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
