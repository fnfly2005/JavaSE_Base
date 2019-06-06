package bean.test;

public class Student extends Person {

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student:" +getName() +":" + getAge();
	}

	
}
