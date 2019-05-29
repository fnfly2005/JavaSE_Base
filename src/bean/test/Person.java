package bean.test;

public class Person {
	private String name;
	private int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public int hashCode() {
		return name.hashCode()+age*40;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			throw new ClassCastException("类型错误");
		
		Person p = (Person) obj;
		return this.name.equals(p.name) && this.age == p.age;
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
