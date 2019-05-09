package wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		wrapperDemo1();
		wrapperDemo2();
		wrapperDemo3();
	}

	private static void wrapperDemo3() {
		System.out.println("java-常用对象API-基本数据类型对象包装类-进制转换");
		System.out.println(Integer.toBinaryString(13));
		System.out.println(Integer.toHexString(13));
		System.out.println(Integer.toOctalString(13));//10进制转8进制
		System.out.println(Integer.parseInt("3c", 16));//16进制转数字
	}

	private static void wrapperDemo2() {
		System.out.println("java-常用对象API-基本数据类型对象包装类-字符串转成基本数值");
		System.out.println(Integer.parseInt("123")+1);//字符串转数字
	}

	private static void wrapperDemo1() {
		int num=6;
		System.out.println("java-常用对象API-基本数据类型对象包装类-Integer");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(-6));
		Integer i = new Integer(num);//将int对象转化为Integer对象
	}

}
