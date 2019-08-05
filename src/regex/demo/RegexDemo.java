package regex.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		
		show1();
		show2();
		show3();
		show4();
		show5();
		show6();

	}

	private static void show6() {
		System.out.println("java-正则表达式-常见的功能-获取");
		String str = "da jia hao,ming tian bu fang jia!";
		String regex = "\\b[a-z]{3}\\b";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

	private static void show5() {
		String tel = "15800001111";
		String oldregex = "(\\d{3})\\d{4}(\\d{4})";
		String newregex = "$1****$2";
		tel = tel.replaceAll(oldregex, newregex);
		System.out.println(tel);
	}

	private static void show4() {
		System.out.println("java-正则表达式-常见的功能-替换");
		String str = "zhangsantttttxiaoqiang    zhaoliu";
		String oldregex = "(.)\\1+";
		String newregex = "$1";
		
		str = str.replaceAll(oldregex, newregex);
		
		System.out.println(str);
	}

	private static void show3() {
		System.out.println("java-正则表达式-常见的功能-切割");
		String str = "zhangsantttttxiaoqiang    zhaoliu";
		String regex = "(.)\\1+";
		String[] names =str.split(regex);
		
		for (String name: names) {
			System.out.println(name);
		}
	}

	private static void show2() {
		System.out.println("java-正则表达式-常见的功能-匹配");
		String tel = "15800001111";
		String regex = "1[358]\\d{9}";
		boolean b = tel.matches(regex);
		
		System.out.println(tel+":"+b);
	}

	private static void show1() {
		System.out.println("java-正则表达式-概述");
		
		String qqString = "259402297";
		
		String regex = "[1-9][0-9]{4,14}";
		
		boolean b = qqString.matches(regex);
		System.out.println(qqString+":"+b);
	}

}
