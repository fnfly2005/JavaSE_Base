package bean.test;

import java.io.Serializable;

@SuppressWarnings("rawtypes")
public class Person implements Comparable,Serializable {
	private String name;
	private int age;
	private static final long serialVersionUID = 4657913l;//显示申明类的序列化版本
	//private transient String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("person run.. ");
	}

	@Override
	public int hashCode() {
		//实现自定义查询-HashSet使用
		return name.hashCode() + age * 40;
	}

	@Override
	public boolean equals(Object obj) {
		//实现自定义比较-ArrayList使用
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			throw new ClassCastException("类型错误");

		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
	}

	@Override
	public int compareTo(Object o) {
		//实现自定义排序-TreeSet使用
		if (!(o instanceof Person))
			throw new ClassCastException("类型错误");

		Person p = (Person) o;
		
		int temp = this.age-p.age;
		
		return temp == 0 ? this.name.compareTo(p.name):temp;//三元运算符

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println(name +"person run.. " +age);
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

	@Override
	public String toString() {
		return getName() + ":" + getAge();
	}
	
	public void show() {
		System.out.println(getName() +"...show run..." +getAge());
	}
	
	@SuppressWarnings("unused")
	private void method() {
		System.out.println("method run ");
	}
	
	public void paramMethod(String str, int num) {
		System.out.println("paramMethod run..." + str + ":" +num);
	}
	
	public static void staticMethod(){
		System.out.println("static Method run...");
	}

}
