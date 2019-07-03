package io.demo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;


public class FileListTest {


	public static void main(String[] args) throws IOException {
		/**
		 * 思路：
		 * 1.必须进行深度遍历
		 * 2.需要对文件名进行过滤,过滤后的文件对象需要存入一个容器
		 * 3.遍历这个容器把数据写入文件
		 */
		System.out.println("java-IO流-综合练习-文件清单列表");
		File dir = new File("/Users/fannian/JaveSE_Base");
		ArrayList<File> files = new ArrayList<File>();
		
		File fo = new File("filelisttest.txt");
		getFiles(dir,new FilterSuffix(".java"),files);
		write2Files(fo,files);
	}

	private static void write2Files(File fo, ArrayList<File> files) throws IOException {
		FileWriter fw = new FileWriter(fo);
		BufferedWriter br = new BufferedWriter(fw);
		for (File f:files)
		{
			br.write(f.getAbsolutePath());
			br.newLine();
			br.flush();
		}
		br.close();
	}

	private static void getFiles(File dir, FilenameFilter filter, ArrayList<File> files) {
		File[] fs = dir.listFiles();
		for (File f:fs)
		{
			if(f.isDirectory())
			{
				getFiles(f, filter, files);
			}
			else {
				files.add(f);
			}
		}
	}


}
