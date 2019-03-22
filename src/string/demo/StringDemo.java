package string.demo;

public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		/*stringDemo1();
		stringDemo2();*/
		stringDemo3();

	}


	private static void stringDemo3() {
		System.out.println("常用对象API-String类-常见功能-获取1");
		String s = "中国abc12中";
		System.out.println("长度："+ s.length());
		System.out.println("首个位置："+ s.indexOf("中"));//返回查找到的第一个值的位置，-1为不存在
		System.out.println("末个位置："+ s.lastIndexOf("中"));//返回查找到的最后一个值的位置，-1为不存在
		System.out.println("位置字符："+ s.charAt(1));
	}


	private static void stringDemo2() {
		System.out.println("常用对象API-String类-构造函数");
		byte[] arr = {65,66,67,68};//字符编码创建字符串
		char[] brr = {'S','B',' ','B','O','S','S'};//多字符创建字符串
		String s1 = new String(brr,0,3);//字符串切片创建
		System.out.println(s1);
	}


	private static void stringDemo1() {
		System.out.println("常用对象API-String类-特点");		
		String s = "abc";
		String s1 = new String("abc");//
		String s2 = "abc";		
		System.out.println(s==s1);//false
		System.out.println(s==s2);//true
	}

}
