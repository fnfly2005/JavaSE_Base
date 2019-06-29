package io.demo;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class FileDemo {

	
	private static final long SPACE = 1024*1024*1024;

	public static void main(String[] args) throws IOException {
		
		show1();
		show2();
		show3();
		show4();
		show5();
	}

	
	private static void show5() {
	   System.out.println("java-IO流-File对象-常见功能-系统根目录和容量获取");
	   File[] files = File.listRoots();
	   for (File file : files)
	   {
		   System.out.println(file);
		   System.out.println(file.getFreeSpace()/SPACE+"GB");
		  System.out.println(file.getTotalSpace()/SPACE+"GB");
		  System.out.println(file.getUsableSpace()/SPACE+"GB");//虚拟机可用空间
	   }
	}
	


	private static void show4() {
		System.out.println("java-IO流-File对象-常见功能-重命名");
		File f1 = new File("H:\\aa.avi");
		File f2 = new File("D:\\DATA\\fannian\\Downloads\\filedemo.avi");
		
		System.out.println(f1.renameTo(f2));//重命名还可以实现剪切操作，类似MV命令
		System.out.println(f2.isAbsolute());
	}


	private static void show3() throws IOException {
		System.out.println("java-IO流-File对象-常见功能-创建和删除");
		System.out.println("java-IO流-File对象-常见功能-判断");
		File f = new File("FileDemo.txt");
		File dir1 = new File("abc");
		File dir2 = new File("abc\\a\\b");
		if (f.exists())
		{
			f.delete();
		}
		System.out.println("f create" + f.createNewFile());//若不存在则创建，存在则不创建
		if (dir1.exists())
		{
			dir1.delete();
		}
		System.out.println("dir1 create" + dir1.mkdir());
		boolean md2 = dir2.mkdirs();
		System.out.println(md2);
		System.out.println("f is file:"+f.isFile());
		System.out.println("f is dir:"+f.isDirectory());
		
	}


	private static void show2() {
		System.out.println("java-IO流-File对象-常见功能-获取");
		File f1 = new File("copyfiletest1.txt");
		String fn = f1.getName();
		String apa = f1.getAbsolutePath();
		String pa = f1.getPath();
		String ppa = f1.getParent();
		Long len = f1.length();
		Long time = f1.lastModified();
		
		Date d = new Date(time);
		
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		
		String str_time = df.format(d);
		
		System.out.println("名称："+fn);
		System.out.println("绝对路径："+apa);
		System.out.println("相对路径："+pa);
		System.out.println("父路径："+ppa);//需要指定对象绝对路径
		System.out.println("修改时间："+str_time);
		System.out.println("大小："+len);
	}

	private static void show1() {
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
