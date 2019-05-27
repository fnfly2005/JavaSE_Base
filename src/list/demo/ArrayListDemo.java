package list.demo;

import java.util.ArrayList;
import java.util.Iterator;

class Person
{
	private String name;
	private int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class ArrayListDemo {

	public static void main(String[] args) {
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
