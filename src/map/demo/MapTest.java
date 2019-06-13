package map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public MapTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		show1();
		show2("星期二");
		
	}



	private static void show2(String s) {
		Map<String,String> m = new HashMap<String,String>();
		m.put("星期一", "Mon");
		m.put("星期二", "Tus");
		m.put("星期日", "Sun");
		System.out.println("java-常用对象API-集合框架-Map集合练习-Map查表法");
		if(m.containsKey(s))
		{
			System.out.println(m.get(s));
		}
	}

	private static void show1() {
		/*
		 * 需求 将字符串切分成字符并根据字母顺序打印其频数
		 * 如：a(2)b(1).....;
		 * 思路 将结果存入一个TreeMap集合
		 * 打印该TreeMap
		 */
		System.out.println("java-常用对象API-集合框架-Map集合练习-记录字母次数代码");
		String str = "fdgavcbsacdfs";
		char [] c = str.toCharArray();
		Map<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		
		for (int i=0;i<c.length;i++)
		{
			int count = 1;
			char key = c[i];
			Integer value = tm.get(key);
			if(value != null)
			{
				count = value + 1;
			}
			tm.put(key, count);
		}
		
		Set<Map.Entry<Character, Integer>> s = tm.entrySet();
		Iterator<Map.Entry<Character, Integer>> it = s.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer> me = it.next();
			System.out.print(me.getKey()+"("+me.getValue()+")");
		}
		System.out.println();
	}

}
