package io.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		write1();
		write2();
	}

	private static void write1() throws IOException {
		System.out.println("java-IO流-字符流-FileWriter");
		FileWriter f = new FileWriter("filewriter_demo.txt");//true 续写模式
		f.write("Hello World"+LINE_SEPARATOR);
		f.flush();//刷新，把缓存区的数据写入文件
		f.close();//关闭资源，关闭前会调用flush刷新到文件
	}

	private static void write2() throws IOException {
		System.out.println("java-IO流-字符流-FileWriter-换行和续写");
		FileWriter f = new FileWriter("filewriter_demo.txt",true);//true 续写模式
		f.write("abcd"+LINE_SEPARATOR);
		f.close();//关闭资源，关闭前会调用flush刷新到文件
	}

}
