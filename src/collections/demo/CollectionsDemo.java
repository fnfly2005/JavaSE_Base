package collections.demo;

import java.util.ArrayList;
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
		System.out.println("java-常用对象API-集合框架-工具类-Collections-排序");
		List<String> list = new ArrayList<String>();
		list.add("abcde");
		list.add("cba");
		list.add("aa");
		list.add("zde");
		list.add("co");
		list.add("nbaa");
		
		System.out.println(list);
		Collections.sort(list);//对集合中的字符串进行排序
		System.out.println(list);
		Collections.sort(list,new ComparatorByLength());//按照字符长度对集合中的字符串进行排序
		System.out.println(list);

	}

}
