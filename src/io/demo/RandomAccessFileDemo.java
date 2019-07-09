package io.demo;


import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {

	public static void main(String[] args) throws IOException{
		writeFile();
		readFile();

	}

	private static void readFile() throws IOException {
		System.out.println("java-IO流-RandomAccessFile-读取&随机读取");
		RandomAccessFile raf = new RandomAccessFile("RandomAccessFileDemo.txt", "r");
		byte[] b = new byte[6];
		
		raf.read(b);
		String name =  new String(b);
		int age = raf.readInt();
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println(raf.getFilePointer());
		raf.seek(20);
		raf.read(b);
		String name2 =  new String(b);
		int age2 = raf.readInt();
		System.out.println("name:"+name2);
		System.out.println("age:"+age2);
		raf.close();
	}

	private static void writeFile() throws IOException {
		System.out.println("java-IO流-RandomAccessFile-写入");
		System.out.println("java-IO流-RandomAccessFile-随机写入&细节");
		
		RandomAccessFile raf = new RandomAccessFile("RandomAccessFileDemo.txt","rw");//若不存在则创建，存在则不创建
		raf.write("张三".getBytes());
		raf.writeInt(97);
		raf.seek(20);
		raf.write("小强".getBytes());
		raf.writeInt(99);
		raf.close();
		
	}

}
