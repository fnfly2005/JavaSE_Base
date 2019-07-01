package io.demo;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		System.out.println("java-IO流-File对象-练习-深度遍历文件夹");
		File f = new File("/Users/fannian/Documents/document_config");
		printFileList(f,0);
		System.out.println("java-IO流-File对象-练习-递归一");
		show1(6);//十进制转二进制
		System.out.println("java-IO流-File对象-练习-递归二");
		System.out.println(show2(5));//求自然数的和

		System.out.println("java-IO流-File对象-练习-删除目录");
		File f1 = new File("/Users/fannian/Downloads/deltest");
		show3(f1);
	}

	private static void show3(File f1) {
		if(f1.isDirectory())
		{
			for (File file: f1.listFiles())
			{
				show3(file);
			}	
			System.out.println(f1.getName() + f1.delete());
		}
		else {
			System.out.println(f1.getName() +":"+ f1.delete());
		}
		
	}

	private static int show2(int i) {
		if(i==1)
		{
			return 1;
		}
		return i+show2(i-1);
	}

	private static void show1(int i) {
		if(i>0)
		{
			System.out.println(i%2);
			show1(i/2);
		}
		
	}

	private static void printFileList(File f,int i) {
		if(f.isDirectory())
		{
			File[] files = f.listFiles();
			for(File file : files)
			{
				printFileList(file,i+1);
			}
		}
		else {
			System.out.println(getSpace(i)+f.getName());
		}
	}

	private static String getSpace(int i) {
		StringBuilder sb = new StringBuilder();
		sb.append("|--");
		for (int x=1;x<i;x++)
		{
			sb.insert(0,"|  ");
		}
		return sb.toString();
	}

}
