package io.demo;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		System.out.println("java-IO流-File对象-练习-深度遍历文件夹");
		File f = new File("/Users/fannian/Documents/document_config");
		printFileList(f,0);

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
