package list.demo;

import java.util.LinkedList;

class DuiZhan{
	private LinkedList link;
	DuiZhan()
	{		
		link = new LinkedList();
	}
	
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}
	public Object myGet()
	{
		return link.pollFirst();
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
}

public class linkedListDemo {

	public static void main(String[] args) {
		show1();
		show2();
		
	}

	private static void show2() {
		System.out.println("常用对象API-集合框架-LinkedList集合练习-堆栈先进后出");
		DuiZhan link = new DuiZhan();
		link.myAdd("abc1");
		link.myAdd("abc2");
		link.myAdd("abc3");
		link.myAdd("abc4");
		while (!link.isNull())
		{
			System.out.println(link.myGet());
		}
	}

	private static void show1() {
		System.out.println("常用对象API-集合框架-LinkedList集合");
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		System.out.println(link.getFirst());//获取第一个但不删除
		while (!link.isEmpty())
		{
			System.out.println(link.removeLast());//删除并返回最后一个
		}
	}

}
