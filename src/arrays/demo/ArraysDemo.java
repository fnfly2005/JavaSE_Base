package arrays.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		show1();
		show2();
		

	}

	private static void show2() {
		System.out.println("java-常用对象API-集合框架-工具类-Collection-toArray方法");
		List<String> list = new ArrayList<String>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		
		String[] arr = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
		//转为数组后 不可以进行增删操作 相当于对集合进行了限定
		
	}

	private static void show1() {
		System.out.println("java-常用对象API-集合框架-工具类-Arrays-asList方法");
		String[] arr = {"abc","haha","xixi"};
		
		List<String> list = Arrays.asList(arr);
		boolean b = list.contains("xixi");
		System.out.println("b="+b);
		System.out.println(list);
		//list.add() UnsupportOperationException 数组的长度固定，不可以使用集合的增删方法
		
		int[] ar2 = {3,4,2,6,7};
		List list2 = Arrays.asList(ar2);
		System.out.println(list2);
		//如果数组的元素是对象 那会将对象分别存放到集合里
		//如果数组的元素是基本类型 那会将数组作为集合中的元素进行存储
	}

}
