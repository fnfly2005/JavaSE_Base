package io.demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class ByteArrayStreamDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-操作数组的流");
		show1();
		show2();
		show3();
	}

	private static void show3() throws IOException {
		StringReader bais = new StringReader("abcdefg");
		StringWriter baos = new StringWriter();
		int len = 0;
		while((len=bais.read())!=-1) {
			baos.write(len);
		}
		
		System.out.println(baos.toString());
	}

	private static void show2() throws IOException {
		CharArrayReader bais = new CharArrayReader("abcdefg".toCharArray());
		CharArrayWriter baos = new CharArrayWriter();
		int len = 0;
		while((len=bais.read())!=-1) {
			baos.write(len);
		}
		
		System.out.println(baos.toString());
	}

	private static void show1() {
		
		ByteArrayInputStream bais = new ByteArrayInputStream("abcdefg".getBytes());
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		int len = 0;
		while((len=bais.read())!=-1) {
			baos.write(len);
		}
		
		System.out.println(baos.toString());
	}

}
