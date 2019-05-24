package list.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		List list1 = show1(list);
		show2(list1);
		show3(list1);
	}

	private static void show3(List list1) {
		System.out.println("java-常用对象API-集合框架-ListIterator接口");
		ListIterator it = list1.listIterator();//获取列表迭代器对象，它可以实现在迭代过程中完成对元素的增删改查
		System.out.println(list1);
		while(it.hasNext())
		{
			Object obj = it.next();
			if (obj.equals("abc3"))
			{
				it.set("abc5");
			}
			else
			{
				System.out.println("next:"+obj);
			}
		}
		System.out.println(list1);
	}

	private static void show2(List list) {
		System.out.println("获取元素:"+list.get(0));//返回被查询的元素
		System.out.println("获取子列表:"+list.subList(0,2));//返回被查询子列表
		System.out.println("删除元素:"+list.remove(2));//返回被删除的元素
		System.out.println("修改元素:"+list.set(1, "abc4"));//返回被修改的元素
	}

	private static List show1(List list) {
		System.out.println("java-常用对象API-集合框架-List集合常见方法-添加元素");
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		System.out.println(list);
		System.out.println("插入元素");
		list.add(1, "abc9");
		System.out.println(list);
		return list;
	}

}
