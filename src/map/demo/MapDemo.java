package map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {


	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		//添加元素

		method1(map);
		method2(map);
		method3(map);
		method4(map);

	}

	private static void method4(Map<Integer, String> map) {
		System.out.println("java-常用对象API-集合框架-方法values演示");
		Collection<String> values = map.values();
		
		Iterator<String> it = values.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	private static void method3(Map<Integer, String> map) {
		System.out.println("java-常用对象API-集合框架-重点方法entrySet演示图解");
		Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<Integer,String>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer,String> es = it.next();
			Integer key = es.getKey();
			String value = es.getValue();
			System.out.println(key + ":" + value);
		}
	}

	private static void method2(Map<Integer, String> map) {
		System.out.println("java-常用对象API-集合框架-重点方法keySet演示图解");
		Set<Integer> ks = map.keySet();
		Iterator<Integer> it =ks.iterator();
		
		while(it.hasNext())
		{
			Integer key = it.next();
			String value = map.get(key);
			System.out.println("key:" + key + " value:" + value);
		}
	}

	private static void method1(Map<Integer,String> map) {
		System.out.println("java-常用对象API-集合框架-常用方法演示");
		//添加元素
		System.out.println(map.put(8, "wangcai"));//null
		System.out.println(map.put(8, "xiaoqiang"));//存相同键，返回覆盖前的值
		map.put(3, "wangwu");
		map.put(2, "zhangsan");
		map.put(7, "zhaoliu");
		
		//删除
		System.out.println(map.remove(2));
		
		//判断
		System.out.println(map.containsKey(7));
		System.out.println(map.containsValue("zhangsan"));
		
		//获取
		System.out.println(map.get(7));
		
		
	}

}
