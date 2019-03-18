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
