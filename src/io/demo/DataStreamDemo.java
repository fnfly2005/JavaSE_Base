package io.demo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-操作基本类型数据的流对象-DataStream");
		writedata();
		readdata();

	}

	private static void readdata() throws IOException {
		DataInputStream dos = new DataInputStream(new FileInputStream("filelisttest.txt"));
		String s = dos.readUTF();
		System.out.println(s);
		dos.close();
	}

	private static void writedata() throws IOException {
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("filelisttest.txt"));
		dos.writeUTF("你好");
		dos.close();
	}

}
