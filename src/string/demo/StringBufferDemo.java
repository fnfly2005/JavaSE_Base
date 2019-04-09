package string.demo;

public class StringBufferDemo {

	public static void main(String[] args) {
		stringDemo1();
		stringDemo2();
	}

	private static void stringDemo2() {
		System.out.println("常用对象API-StringBuffer类-插入&删除&查找&修改/可变长度数组");
		StringBuffer sb = new StringBuffer(2);//默认长度16，指定长度2的话，若长度超过这个长度值则会增加资源消耗
		sb.append("Hello world");
		System.out.println(sb.charAt(0));//查询指定位置的字符
		System.out.println(sb.indexOf("l"));//查询指定字符的第一个位置
		System.out.println(sb.lastIndexOf("l"));//查询指定字符的最后一个位置
		sb.deleteCharAt(0);//删除指定索引位置字符
		System.out.println(sb);
		sb.replace(1, 3, "nba");//替换成指定字符串
		System.out.println(sb);
		sb.setCharAt(0, 'H');//替换指定索引位置字符
		System.out.println(sb);
		sb.reverse();//反转字符串
		System.out.println(sb);
		sb.setLength(3);//设置长度为3，会删除长度3以后的部分
		System.out.println(sb);
		sb.delete(0, sb.length());//清空缓存区
		System.out.println(sb);
		
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
