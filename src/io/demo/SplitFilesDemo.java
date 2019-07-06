package io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;


public class SplitFilesDemo {

	private static final int SIZE = 524288;

	public static void main(String[] args) throws IOException {
		
		/**
		 * 思路：
		 * 1、需要一个输入流
		 * 2、需要指定文件大小
		 * 3、需要多个输出流
		 * 4、合并时需要知道文件数量和文件名
		 * 5、所以分割时需要将文件名和文件数量存储到配置文件，以便合并时读取
		 */
		System.out.println("java-IO流-文件切割合并+配置文件");
		File maindir = new File("D:\\DATA\\fannian\\Downloads\\JaveSE_Base");
		File f1 = new File(maindir,"test.bmp");
		File dir = new File(maindir,"filesplit");
		
		if (!dir.exists()){
			dir.mkdir();
		}
		
		SplitFileDemo(f1,dir);
		MegerFiledemo(dir);

	}

	private static void MegerFiledemo(File dir) throws IOException {
		System.out.println("java-IO流-文件合并");
		
		//读取配置文件
		File[] props = dir.listFiles(new FilterSuffix(".properties"));
		if (props.length!=1) {
			throw new RuntimeException("读取配置文件失败");
		}
		FileInputStream fps = new FileInputStream(props[0]);
		Properties prop = new Properties();
		prop.load(fps);
		
		//验证文件数量
		int value = Integer.parseInt(prop.getProperty("filenum"));
		File[] files = dir.listFiles(new FilterSuffix(".part"));		
		if (files.length!=value) {
			throw new RuntimeException("文件数量验证失败,应该是"+value +"个");
		}
		
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for (int x=1;x<=files.length;x++) {
			al.add(new FileInputStream(new File(dir,x+".part")));
		}
		Enumeration<FileInputStream> e = Collections.enumeration(al);
		SequenceInputStream sis = new SequenceInputStream(e);
		
		File fileout = new File(dir,prop.getProperty("filename"));
		FileOutputStream fos = new FileOutputStream(fileout);
		
		byte[] buf = new byte[SIZE];
		
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			fos.write(buf, 0, len);
		}
		fps.close();
		fos.close();
		sis.close();
		
	}

	private static void SplitFileDemo(File f,File dir) throws IOException {
		System.out.println("java-IO流-文件切割");
		FileInputStream fis = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.setProperty("filename", f.getName());		
		
		byte[] buf = new byte[SIZE];
		FileOutputStream fos = null;
		
		int len = 0;
		int count = 0;
		while ((len=fis.read(buf))!=-1)
		{
			count++;
			fos = new FileOutputStream(new File(dir,count+".part"));
			fos.write(buf, 0, len);			
		}
		prop.setProperty("filenum", count+"");
		fos = new FileOutputStream(new File(dir,"fileinfo.properties"));
		prop.store(fos, "splitfile");
		fos.close();
		fis.close();
		
	}

}
