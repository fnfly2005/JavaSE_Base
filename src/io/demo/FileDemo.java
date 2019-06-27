package io.demo;

import java.io.File;

public class FileDemo {

	
	public static void main(String[] args) {
		System.out.println("java-IO流-File对象-构造函数&字段");
		//可以将一个已存在的，或者不存在的文件或者目录封装成file对象
		File f1 = new File("fannian/a.txt");
		File f2 = new File("fannian/","a.txt");
		File f3 = new File("fannian/");
		File f4 = new File(f3,"a.txt");
		File f5 = new File("fannian"+File.separator+"a.txt");
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(File.pathSeparator);//路径分隔符，如环境变量路径
		

	}

}
