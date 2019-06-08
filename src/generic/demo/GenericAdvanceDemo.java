package generic.demo;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import bean.test.*;


class ComparaByName implements Comparator<Person>
{

	@Override
	public int compare(Person p1, Person p2) {
		int temp = p1.getName().compareTo(p2.getName());
		return temp==0?p1.getAge()-p2.getAge():temp;
	}
	
}

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		System.out.println("java-常用对象API-集合框架-泛型-泛型限定(下限的体现)");
		TreeSet<Person> ts1 = new TreeSet<Person>();
		
		ts1.add(new Person("Per7",23));
		ts1.add(new Person("Per5",31));
		
		TreeSet<Student> ts2 = new TreeSet<Student>(new ComparaByName());//  TreeSet(Comparator<? super E> comparator) 取出操作时往往使用下限
		
		ts2.add(new Student("std1",13));
		ts2.add(new Student("std2",11));

		TreeSet<Worker> ts3 = new TreeSet<Worker>();
		
		ts3.add(new Worker("wok0",22));
		ts3.add(new Worker("wok3",21));
		
		ts1.addAll(ts3);
		printCollection(ts1);
		printCollection(ts2);

	}

	private static void printCollection(Collection<? super Student> ts) {
		Iterator <? super Student> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
		
	}
	

}
