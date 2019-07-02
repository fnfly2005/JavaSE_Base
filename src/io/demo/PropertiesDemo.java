package io.demo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "31");
		prop.setProperty("xiaoqiang", "20");
		prop.setProperty("wangcai", "23");
		
		show1(prop);
		show2(prop);
		show3(prop);
	
		show4();

	}

	private static void show4() throws IOException {
		System.out.println("java-IO流-Properties集合-修改配置信息");
		Properties prop = new Properties();
		File f = new File("PropertiesDemo.txt");
		if(!f.exists())
		{
			f.createNewFile();
		}
		FileReader fr = new FileReader("PropertiesDemo.txt");
		prop.load(fr);
		prop.setProperty("zhangsan", "16");
		fr.close();
		
		FileWriter fw = new FileWriter("PropertiesDemo.txt");
		prop.store(fw, "newinfo");
		fw.close();
	}

	private static void show3(Properties prop) throws IOException {
		System.out.println("java-IO流-Properties集合-store方法");
		FileOutputStream f = new FileOutputStream("PropertiesDemo.txt");
		prop.store(f, "info");//备注别写中文
		f.close();
	}

	private static void show2(Properties prop) {
		System.out.println("java-IO流-Properties集合-list方法");
		prop.list(System.out);
	}

	private static void show1(Properties prop) {
		System.out.println("java-IO流-Properties集合-基本功能");
		for (String sp:prop.stringPropertyNames())
		{
			System.out.println(sp+":"+prop.getProperty(sp));
		}
	}

}
