package string.demo;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 */
		stringDemo1();
		stringDemo2();
		stringDemo3();

	}


	private static void stringDemo3() {
		byte[] arr = {65,66,67,68};//字符编码创建字符串
		char[] brr = {'S','B',' ','B','O','S','S'};//多字符创建字符串
		String s1 = new String(brr,0,3);//字符串切片创建
		System.out.println(s1);
	}


	public static void stringDemo2() {
		// TODO Auto-generated method stub
		
		String s = "abc";//	
		String s1 = new String("abc");//
		
		System.out.println(s==s1);//false
		
		System.out.println(s.equals(s1));		
	}

	private static void stringDemo1() {
		String s = "abc";
		String s1 = "abc";		
		System.out.println(s==s1);//true
//		System.out.println("s="+s);
	}

}
