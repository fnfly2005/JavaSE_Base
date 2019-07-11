package io.demo;

import java.io.IOException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		sample();
		recode1();
		recode2();
	}

	private static void recode2() throws IOException {
		System.out.println("java-IO流-编码解码问题二");
		String s = "你好!";		
		byte[] buf = s.getBytes("gbk");
		
		String str = new String(buf,"UTF-8");
		System.out.println(str);
		byte[] bu2 = str.getBytes("UTF-8");
		System.out.println(new String(bu2,"gbk"));
	}

	private static void recode1() throws IOException {
		System.out.println("java-IO流-编码解码问题一");
		String s = "你好!";		
		byte[] buf = s.getBytes("gbk");
		
		String str = new String(buf,"ISO8859-1");
		System.out.println(str);
		byte[] bu2 = str.getBytes("ISO8859-1");
		System.out.println(new String(bu2,"gbk"));
	}

	private static void sample() throws IOException {
		System.out.println("java-IO流-简单的编码解码");
		String s = "你好!";		
		byte[] buf = s.getBytes("utf-8");
		printBytes(buf);
		
		String str = new String(buf,"utf-8");
		System.out.println(str);
	}

	private static void printBytes(byte[] buf) {
		for (byte b: buf) {
			System.out.print(b+" ");
		}
		System.out.println();
	}



}
