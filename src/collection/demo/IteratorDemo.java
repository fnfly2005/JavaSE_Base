package collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection coll = new ArrayList();
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
		

		System.out.println("java-常用对象API-集合框架-迭代器的使用");
		
		Iterator it = coll.iterator();		
		while (it.hasNext())
		{//变量对象可以继续使用
			System.out.println(it.next());
		}
		
		for(Iterator at = coll.iterator(); at.hasNext();)
		{//节省内存
			System.out.println(at.next());
		}

	}

}
