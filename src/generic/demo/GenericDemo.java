package generic.demo;

import bean.test.Person;

public class GenericDemo {

	public static void main(String[] args) {
		
		show1();
		show2();
		show3();

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

