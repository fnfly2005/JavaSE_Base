package collections.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ComparatorByLength implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		int temp = o1.length()-o2.length();
		return temp == 0?o1.compareTo(o2):temp;
	}
	
}

public class CollectionsDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zde");
		list.add("co");
		list.add("nbaa");
		
		show1(list);
		show2(list);
		show3(list);
		show4(list);
		int[] arr = {3,1,5,6,3,6};
		
		show5(arr);

	}


	private static void show5(int[] arr) {
		System.out.println("java-常用对象API-集合框架-工具类-Arrays-方法介绍");
		System.out.println(Arrays.toString(arr));
	}


	private static void show4(List<String> list) {
		System.out.println("java-常用对象API-集合框架-工具类-Collections-其他方法&将非同步集合转成同步集合的方法");
		Collections.shuffle(list);
		System.out.println(list);
		Collections.fill(list, "cc");
		System.out.println(list);
		Collections.synchronizedList(list);//把非同步的list转换成同步的list
	}

	private static void show3(List<String> list) {
		System.out.println("java-常用对象API-集合框架-工具类-Collections-逆序&替换");
		Collections.shuffle(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder(new ComparatorByLength()));//使用自定义比较器进行逆序排序
		System.out.println(list);
		Collections.replaceAll(list, "cba", "cbaa");//替换集合对象
		System.out.println(list);
	}

	private static void show2(List<String> list) {
		System.out.println("java-常用对象API-集合框架-工具类-Collections-折半&最值");
		Collections.shuffle(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.max(list,new ComparatorByLength()));
		
		//排序后才能进行折半查找
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, "co"));
	}

	private static void show1(List<String> list) {
		System.out.println("java-常用对象API-集合框架-工具类-Collections-排序");
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);//对集合中的字符串进行排序
		System.out.println(list);
		Collections.sort(list,new ComparatorByLength());//按照字符长度对集合中的字符串进行排序
		System.out.println(list);
	}

}
