package date.demo;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		show1();

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
