package set.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		System.out.println("java-常用对象API-集合框架-LinkedHashSet集合");
		HashSet hs = new LinkedHashSet();
		
		hs.add("haha");
		hs.add("hehe");
		hs.add("heihei");
		hs.add("xixi");
		hs.add("hehe");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());//有序唯一
		}

	}

}
