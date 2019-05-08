package wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		wrapperDemo1();
		wrapperDemo2();
	}

	private static void wrapperDemo2() {
		System.out.println("java-常用对象API-基本数据类型对象包装类-字符串转成基本数值");
		System.out.println(Integer.parseInt("123")+1);
	}

	private static void wrapperDemo1() {
		int num=6;
		System.out.println("java-常用对象API-基本数据类型对象包装类-Integer");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		Integer i = new Integer(num);//将int对象转化为Integer对象
	}

}
