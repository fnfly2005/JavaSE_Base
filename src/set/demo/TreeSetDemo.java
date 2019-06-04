package set.demo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import bean.test.Person;

class TreeSetComparatorDemo implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2) {
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;//该返回值应用于二叉树数据结构，为正放右边，为负放左边
	}	
}

class TreeSetComparatorDemo2 implements Comparator<String>
{

	@Override
	public int compare(String s1, String s2) {
		int temp = s1.length()-s2.length();
		return temp == 0?s1.compareTo(s2):temp;
	}
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		show1();
		show2();
		show3();
	}

	private static void show3() {
		/*
		 * 根据字符串长度进行排序
		 */
		System.out.println("java-常用对象API-集合框架-TreeSet集合练习-字符串长度排序");
		System.out.println("java-常用对象API-集合框架-泛型-概述");
		TreeSet<String> ts = new TreeSet<String>(new TreeSetComparatorDemo2());
		ts.add("aaaaa");
		ts.add("zz");
		ts.add("nbaq");
		ts.add("cba");
		ts.add("abc");
		
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void show2() {
		/*
		 * 不改变person类的情况下，实现按名称从小到大排列
		 */
		System.out.println("java-常用对象API-集合框架-TreeSet集合-Comparator比较器");
		TreeSet<Person> ts = new TreeSet<Person>(new TreeSetComparatorDemo());
		ts.add(new Person("zhangsan",28));
		ts.add(new Person("wangwu",21));
		ts.add(new Person("lisi",29));
		ts.add(new Person("zhouqi",22));
		ts.add(new Person("zhaoliu",25));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-TreeSet集合");
		TreeSet<Person> ts = new TreeSet<Person>();
		ts.add(new Person("zhangsan",28));
		ts.add(new Person("wangwu",21));
		ts.add(new Person("lisi",29));
		ts.add(new Person("zhouqi",22));
		ts.add(new Person("zhaoliu",25));
		
		Iterator<Person> it = ts.iterator();
		
		while(it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getName()+":"+p.getAge());
		}
	}

}
