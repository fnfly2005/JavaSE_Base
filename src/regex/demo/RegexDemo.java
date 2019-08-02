package regex.demo;

public class RegexDemo {

	public static void main(String[] args) {
		
		System.out.println("java-正则表达式-概述");
		
		String qqString = "259402297";
		
		String regex = "[1-9][0-9]{4,14}";
		
		boolean b = qqString.matches(regex);
		System.out.println(qqString+":"+b);

	}

}
