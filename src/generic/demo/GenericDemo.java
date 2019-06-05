package generic.demo;

import bean.test.Person;

public class GenericDemo {

	public static void main(String[] args) {
		
		System.out.println("java-常用对象API-集合框架-泛型-泛型类");
		Tool<Person> tool = new Tool<Person>();
		tool.setObj(new Person());			
		Person p = tool.getObj();

	}

}
