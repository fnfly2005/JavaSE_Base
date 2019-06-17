package date.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		show1();
		show2();
	}

	private static void show2() {
		
		System.out.println("java-其他对象API-Date类-日期对象转成字符串");
		Date d1 = new Date();
		//指定风格日期及时间类型
		DateFormat dateformat1 = DateFormat.getDateInstance();
		DateFormat dateformat2 = DateFormat.getDateInstance(DateFormat.LONG);
		DateFormat datetimeformat = DateFormat.getDateTimeInstance();

		System.out.println(dateformat1.format(d1));
		System.out.println(dateformat2.format(d1));
		System.out.println(datetimeformat.format(d1));
		//自定义日期及时间类型
		DateFormat dateformat3 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateformat3.format(d1));
	}

	private static void show1() {
		System.out.println("java-其他对象API-Date类");
		Date d1 = new Date();
		Date d2 = new Date(1560774239243l);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.getTime());
		d2.setTime(1560771239243l);
		System.out.println(d2);
		System.out.println(d2.compareTo(d1));
		System.out.println(d1.toString());
	}

}
