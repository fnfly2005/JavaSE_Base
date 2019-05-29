package set.demo;

import java.util.HashSet;
import java.util.Iterator;

import bean.test.Person;

public class HashSetDemo {

	public static void main(String[] args) {
		show1();
		show2();

	}

	private static void show2() {
		System.out.println("java-常用对象API-集合框架-HashSet存储自定义对象");
		HashSet hs = new HashSet();
		hs.add(new Person("lisi4",24));
		hs.add(new Person("lisi7",27));
		hs.add(new Person("lisi1",21));
		hs.add(new Person("lisi9",29));
		hs.add(new Person("lisi7",27));//覆盖系统的hashCode和equals方法后才能实现对象不重复
		
		Iterator it = hs.iterator();
		
		while (it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getName()+"...."+p.getAge());
		}		
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-HashSet集合");
		HashSet hs = new HashSet();
		hs.add("haha");
		hs.add("xixi");		
		hs.add("hehe");
		hs.add("heihei");
		hs.add("haha");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
