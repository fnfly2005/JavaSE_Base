package io.demo;

import java.io.IOException;

public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		sample();

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
