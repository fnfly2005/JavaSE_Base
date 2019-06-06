package bean.test;

public class Worker extends Person {

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Worker(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker:" + getName() + ":" + getAge();
	}
	

}
