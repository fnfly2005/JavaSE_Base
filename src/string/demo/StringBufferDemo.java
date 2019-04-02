package string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		stringDemo1();
	}

	private static void stringDemo1() {
		System.out.println("常用对象API-StringBuffer类-特点&添加功能");
		StringBuffer sb = new StringBuffer();
		sb.append(4).append(false);//添加
		System.out.println(sb);
		sb.insert(2, "xixi");//插入
		System.out.println(sb);
	}

}
