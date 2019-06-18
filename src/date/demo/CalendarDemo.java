package date.demo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cd = Calendar.getInstance();
		System.out.println("java-其他对象API-Calender类-基本演示");
		show1(cd);
		System.out.println("java-其他对象API-Calender类-练习");
		show2(2004);
	}

	private static void show2(int year) {	
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH,-1);
		show1(c);
	}

	private static void show1(Calendar cd) {	
		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH)+1;
		int day = cd.get(Calendar.DAY_OF_MONTH);
		int week = cd.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year +"年"+ month +"月"+day+"日"+" " +getweek(week));
	}

	private static String getweek(int week) {
		String[] weeks = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return weeks[week];
	}

}
