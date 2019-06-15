package arrays.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
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
