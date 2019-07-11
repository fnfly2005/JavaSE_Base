package io.demo;

import java.io.IOException;


public class EncodeDemo {

	public static void main(String[] args) throws IOException {
		sample();
		recode1();
		recode2();
		System.out.println("java-IO流-按字节截取字符串");
		String st = "ab你好cd谢谢";
		int len = st.getBytes("utf-8").length;
		for (int x =0;x<len;x++) {
			System.out.println("截取"+(x+1)+"个字节结果是："+cutStringByByte(st,x+1));
		}
		
	}



	private static String cutStringByByte(String st, int i) throws IOException {
		byte[] buf = st.getBytes("utf-8");
		int count = 0;
		for(int x=i-1;x>=0;x--) {
			if(buf[x]<0) {
				count++;
			}
			else {
				break;
			}
		}
		if(count%3==1) {
			return new String(buf, 0, i-1,"utf-8");
		}
		else if (count%3==2) {
			return new String(buf, 0, i-2,"utf-8");
		}
		else {
			return new String(buf, 0, i,"utf-8");
		}
		
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
