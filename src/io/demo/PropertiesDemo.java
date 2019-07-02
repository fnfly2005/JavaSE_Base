package io.demo;
import java.io.FileOutputStream;
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
		System.out.println("java-IO流-Properties集合-list方法");
		prop.list(System.out);
		System.out.println("java-IO流-Properties集合-store方法");
		FileOutputStream f = new FileOutputStream("FileDemo.txt");
		prop.store(f, "info");//备注别写中文
		f.close();

	}

	private static void show1(Properties prop) {
		System.out.println("java-IO流-Properties集合-基本功能");
		for (String sp:prop.stringPropertyNames())
		{
			System.out.println(sp+":"+prop.getProperty(sp));
		}
	}

}
