package bean.test;

public class Person implements Comparable {
	private String name;
	private int age;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
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

}
