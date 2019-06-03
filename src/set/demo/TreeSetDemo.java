package set.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import bean.test.Person;

class TreeSetComparatorDemo implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;//该返回值应用于二叉树数据结构，为正放右边，为负放左边
	}	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		show1();
		show2();
	}

	private static void show2() {
		/*
		 * 不改变person类的情况下，实现按名称从小到大排列
		 */
		System.out.println("java-常用对象API-集合框架-TreeSet集合-Comparator比较器");
		TreeSet ts = new TreeSet(new TreeSetComparatorDemo());
		ts.add(new Person("zhangsan",28));
		ts.add(new Person("wangwu",21));
		ts.add(new Person("lisi",29));
		ts.add(new Person("zhouqi",22));
		ts.add(new Person("zhaoliu",25));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-TreeSet集合");
		TreeSet ts = new TreeSet();
		ts.add(new Person("zhangsan",28));
		ts.add(new Person("wangwu",21));
		ts.add(new Person("lisi",29));
		ts.add(new Person("zhouqi",22));
		ts.add(new Person("zhaoliu",25));
		
		Iterator it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
