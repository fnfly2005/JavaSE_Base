package collection.demo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		//show1(coll);
		Collection c1 = new ArrayList();
		Collection c2 = new ArrayList();
		Collection c3 = new ArrayList();
		show2(c1,c2,c3);
	}

	private static void show2(Collection c1,Collection c2,Collection c3) {
		System.out.println("java-常用对象API-集合框架-方法2");
		System.out.println("给c1添加元素");
		c1.add("abc1");
		c1.add("abc2");
		c1.add("abc3");
		c1.add("abc4");
		System.out.println("c1:"+c1);
		System.out.println("给c2添加元素");
		c2.add("abc2");
		c2.add("abc6");
		c2.add("abc7");
		System.out.println("c2:"+c2);
		System.out.println("给c3添加元素");
		c3.add("abc1");
		c3.add("abc2");
		c3.add("abc5");
		System.out.println("c3:"+c3);
		
		System.out.println("将c2元素添加到c1");
		c1.addAll(c2);
		System.out.println("c1:"+c1);
		
		System.out.println("求两集合的差集c1-c2");
		boolean b = c1.removeAll(c2);
		System.out.println("removeAll:"+b);
		System.out.println("c1:"+c1);
		
		System.out.println("求两集合的交集");
		c1.retainAll(c3);
		System.out.println("c1:"+c1);		
	}

	private static void show1(Collection coll) {
		System.out.println("java-常用对象API-集合框架-方法1");
		System.out.println("添加元素");
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		System.out.println(coll);
		
		System.out.println("删除元素");
		coll.remove("abc2");
		System.out.println(coll);
		
		System.out.println("清空集合");
		coll.clear();
		System.out.println(coll);
		
		System.out.println("包含集合");
		System.out.println(coll.contains("abc4"));		
	}

}
