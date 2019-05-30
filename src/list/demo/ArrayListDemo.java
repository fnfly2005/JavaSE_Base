package list.demo;

import java.util.ArrayList;
import java.util.Iterator;
import bean.test.Person;

public class ArrayListDemo {

	public static void main(String[] args) {
		show1();
		show2();
	}

	private static void show2() {
		System.out.println("java-常用对象API-集合框架练习");
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		al.add(new Person("lisi2",22));
		
		System.out.println(al);
		al = getSingleElement(al);
		System.out.println(al);
	}

	private static ArrayList getSingleElement(ArrayList al) {
		ArrayList temp = new ArrayList();
		Iterator it = al.iterator();
		while (it.hasNext())
		{
			Object obj = it.next();//强转对象以便使用该对象方法
			if(!temp.contains(obj)) {
				temp.add(obj);
			};
		}
		return temp;
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-ArrayList集合存储自定对象");
		ArrayList al = new ArrayList();
		al.add(new Person("lisi1",21));
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		
		Iterator it = al.iterator();
		while (it.hasNext())
		{
			Person p = (Person) it.next();//强转对象以便使用该对象方法
			System.out.println(p.getName()+":"+p.getAge());//next每次引用都会读取下一对象，得使用变量
		}
	}

}
