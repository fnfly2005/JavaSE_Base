package date.demo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		show1();
	}

	private static void show1() {
		System.out.println("java-其他对象API-Calender类-基本演示");
		Calendar cd = Calendar.getInstance();
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
