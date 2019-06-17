package system.demo;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemDemo {

	public static void main(String[] args) {
		
		demo_1();
		demo_2();
		demo_3();

	}


	private static void demo_3() {
		System.out.println("java-其他对象API-System类-line.separator");
		
		System.out.println("Hello"+ System.getProperty("line.separator")+"world");
		//System.setProperty("myclasspath","c:\myclass") 可以设置自己的系统属性，其他程序都可以使用
	}

	private static void demo_1() {
		System.out.println("java-其他对象API-System类-currentTimeMillis");
		long i = System.currentTimeMillis();
		System.out.println(i);
	}

	private static void demo_2() {
		System.out.println("java-其他对象API-System类-getProperties");
		Properties prop = System.getProperties();
		Set<String> se = prop.stringPropertyNames();
		for (String name: se)
		{
			String value = prop.getProperty(name);
			System.out.println(name + " : " + value);
		}
	}

}
