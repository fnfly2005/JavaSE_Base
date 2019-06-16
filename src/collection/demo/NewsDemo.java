package collection.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NewsDemo {

	public static void main(String[] args) {
		System.out.println("java-常用对象API-集合框架-JDK5.0特性-ForEach循环");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bbc");
		list.add("cbc");
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
