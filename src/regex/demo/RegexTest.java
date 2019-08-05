package regex.demo;

import java.util.TreeSet;

public class RegexTest {

	public static void main(String[] args) {
		
		test_1();
		test_2();
		test_3();

	}

	private static void test_3() {
		System.out.println("java-正则表达式-练习3");
		String mail = "abc1@sina.com";
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{1,3})+";
		
		boolean b =mail.matches(regex);
		System.out.println(mail+":"+b);
	}

	private static void test_2() {
		System.out.println("java-正则表达式-练习2");
		String str = "192.168.10.34  127.0.0.1   3.3.3.3  105.70.11.55";
		str=str.replaceAll("(\\d+)", "00$1");
		str=str.replaceAll("0*(\\d{3})", "$1");
		System.out.println(str);
				
				
		String[] ips = str.split(" +");
		TreeSet<String> ts = new TreeSet<String>();
		
 		for (String ip:ips) {
 			ts.add(ip);
			
		}
 		
 		for (String ip:ts) {
 			System.out.println(ip.replaceAll("0*(\\d+)", "$1"));
 		}
	}

	private static void test_1() {
		System.out.println("java-正则表达式-练习1");
		String str = "我我...我我...我我我要...要要要要...要要要要..学学学学学...学学编编...编编编编..编..程程...程程";
		str = str.replaceAll("\\.+", "");
		str = str.replaceAll("(.)\\1+", "$1");
		System.out.println(str);
	}

}
