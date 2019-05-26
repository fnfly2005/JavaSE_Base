package list.demo;

import java.util.LinkedList;
public class linkedListDemo {

	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
	
		System.out.println("常用对象API-集合框架-LinkedList集合");
		System.out.println(link.getFirst());//获取第一个但不删除
		while (!link.isEmpty())
		{
			System.out.println(link.removeLast());//删除并返回最后一个
		}
	}

}
