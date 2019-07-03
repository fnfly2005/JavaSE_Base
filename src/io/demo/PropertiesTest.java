package io.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-Properties集合-练习");
		show();
			

	}

	private static void show() throws IOException {
		File f = new File("count.properties");
		if(!f.exists())
		{
			f.createNewFile();
		}
		
		FileInputStream f1 = new FileInputStream(f);
		
		Properties prop = new Properties();
		
		prop.load(f1);
		
		int count = 0;
		
		String value = prop.getProperty("time");
		
		if(value!=null)
		{
			count = Integer.parseInt(value);
			if(count>=5)
			{
				throw new RuntimeException("超过使用次数，请注册，给钱");
			}
		}
		
		count++;
		prop.setProperty("time", count+"");
		FileOutputStream f2 = new FileOutputStream(f);
		prop.store(f2, "");
		
		f1.close();
		f2.close();
	}

}
