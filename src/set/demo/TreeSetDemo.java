package set.demo;

import java.util.Iterator;
import java.util.TreeSet;

import bean.test.Person;

public class TreeSetDemo {

	public static void main(String[] args) {
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
