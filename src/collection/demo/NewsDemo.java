package collection.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.Collections.*;

public class NewsDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bbc");
		list.add("cbc");
		show1(list);
		int s = show2(2,3,6,3,2,6,8);
		System.out.println(s);
		
		show3(list);
	}

	private static void show3(List<String> list) {
		System.out.println("java-常用对象API-集合框架-JDK5.0特性-静态导入");
		sort(list);
		System.out.println(list);
		System.out.println(max(list));
	}

	private static int show2(int... arr) {
		System.out.println("java-常用对象API-集合框架-JDK5.0特性-函数可变参数");
		//其实就是一个数组 但接收的是数组的元素 自动将元素封装成数组 简化书写
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum += arr[i];		
		}
		return sum;
		
	}

	private static void show1(List<String> list) {
		System.out.println("java-常用对象API-集合框架-JDK5.0特性-ForEach循环");
		//高级for
		for(String s: list)
		{
			System.out.println(s);
		}
		
		int[] arr = {1,2,35,376,7};
		for(int s: arr)
		{
			System.out.println(s);
		}
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(3, "zhangsan");
		map.put(1, "xiaoqiang");
		map.put(7, "wangwu");
		map.put(4, "zhangda");
		
		for (Map.Entry<Integer,String> me : map.entrySet())
		{
			System.out.println(me.getKey()+":"+me.getValue());
		}
	}

}
