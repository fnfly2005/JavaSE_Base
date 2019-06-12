package map.demo;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import bean.test.Person;
import bean.test.Student;

class ComparaByName implements Comparator<Student>
{

	@Override
	public int compare(Student p1, Student p2) {
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;
	}
	
}

public class MapDemo {


	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		//添加元素

		method1(map);
		method2(map);
		method3(map);
		method4(map);
		show1();
		show2();
		show3();

	}

	private static void show3() {
		System.out.println("java-常用对象API-集合框架-Map集合-LinkedHashMap&关联源码");
		LinkedHashMap<Student,String> hm = new LinkedHashMap<Student,String>();
		printmap(hm);
	}

	private static void show2() {
		System.out.println("java-常用对象API-集合框架-Map集合-TreeMap存储自定义对象");
		TreeMap<Student,String> am = new TreeMap<Student,String>();
		TreeMap<Student,String> hm = new TreeMap<Student,String>(new ComparaByName());
		printmap(am);//按类内置的比较器排序
		printmap(hm);//按外部实现的Comparator接口排序
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-Map集合-HashMap存储自定义对象");
		HashMap<Student,String> hm = new HashMap<Student,String>();		
		printmap(hm);//键的唯一性依赖于类的HashCode方法
	}

	private static void printmap(Map<Student, String> hm) {
		hm.put(new Student("xiaoqiang",38), "北京");
		hm.put(new Student("zhaoliu",24), "上海");
		hm.put(new Student("lisi",31), "沈阳");
		hm.put(new Student("wangcai",28), "大连");
		hm.put(new Student("zhaoliu",24), "铁岭");
		Set<Map.Entry<Student, String>> s = hm.entrySet();
		Iterator<Map.Entry<Student, String>> it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry<Student, String> me = it.next();
			Student key = me.getKey();
			String value = me.getValue();
			System.out.println(key.getName() + ":" + key.getAge() + "--" + value);
		}
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
