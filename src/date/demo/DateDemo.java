package date.demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		show1();
		show2();
		show3();	
		show4("2019-05-18","2019-06-18");
	}

	private static void show4(String s1,String s2) throws ParseException {
		System.out.println("java-其他对象API-Date类-练习");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		long time2 = df.parse(s2).getTime();
		long time1 = df.parse(s1).getTime();
		long day = (time2 -time1)/1000/60/60/24;
		System.out.println(day);
	}

	private static void show3() throws ParseException {
		System.out.println("java-其他对象API-Date类-字符串转成日期对象");
		String str1 = "2019-6-18";
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println(df1.parse(str1));
		String str2 = "2019年6月18日";
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df2.parse(str2));
		String str3 = "2019-06-18";
		DateFormat df3 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(df3.parse(str3));
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
