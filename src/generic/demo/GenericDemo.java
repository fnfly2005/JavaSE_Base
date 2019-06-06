package generic.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import bean.test.*;

public class GenericDemo {

	public static void main(String[] args) {
		
		show1();
		show2();
		show3();
		show4();

	}

	private static void show4() {
		System.out.println("java-常用对象API-集合框架-泛型-泛型限定(上限)");
		ArrayList<Worker> al = new ArrayList<Worker>();
		
		al.add(new Worker("lisi",24));
		al.add(new Worker("zhangsan",21));
		
		HashSet<Student> al2 = new HashSet<Student>();
		
		al2.add(new Student("wangwu",16));
		al2.add(new Student("wangcai",11));
		
		printCollection(al);
		printCollection(al2);
	}

	private static void printCollection(Collection<? extends Person> al) {
		/*
		 * 迭代并打印集合中元素
		 */
		Iterator<? extends Person> it = al.iterator();
		while (it.hasNext())
		{
			Person p = it.next();
			System.out.println(p.getName() +":"+p.getAge());
		}
	}

	private static void show3() {
		System.out.println("java-常用对象API-集合框架-泛型-泛型接口");
		InterDemo<String> id = new InterDemo<String>();
		id.show("haha");		
	}

	private static void show2() {
		System.out.println("java-常用对象API-集合框架-泛型-泛型方法");
		Tool<String> tool = new Tool<String>();
		tool.show(new Integer(4));
		tool.print("abc");
		
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-泛型-泛型类");
		Tool<Person> tool = new Tool<Person>();
		tool.setObj(new Person());			
		Person p = tool.getObj();
	}

}

interface Inter<T>{
	public void show(T t);
}

class InterDemo<Q> implements Inter<Q>{

	@Override
	public void show(Q t) {
		System.out.println(t);
	}
	
}

