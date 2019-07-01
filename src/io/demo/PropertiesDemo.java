package io.demo;

import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		System.out.println("java-IO流-Properties集合的-基本功能");
		Properties prop = new Properties();
		prop.setProperty("zhangsan", "30");
		prop.setProperty("lisi", "31");
		prop.setProperty("xiaoqiang", "20");
		prop.setProperty("wangcai", "23");
		
		for (String sp:prop.stringPropertyNames())
		{
			System.out.println(sp+":"+prop.getProperty(sp));
		}

	}

}
