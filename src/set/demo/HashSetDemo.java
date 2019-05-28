package set.demo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		System.out.println("java-常用对象API-集合框架-HashSet集合");
		HashSet hs = new HashSet();
		hs.add("haha");
		hs.add("xixi");		
		hs.add("hehe");
		hs.add("heihei");
		hs.add("haha");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
