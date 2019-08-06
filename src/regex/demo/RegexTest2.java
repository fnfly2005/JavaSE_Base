package regex.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 爬取网页地址
 */
public class RegexTest2 {

	public static void main(String[] args) throws IOException {
		System.out.println("java-正则表达式-练习4爬虫");
		List<String> list= getMails();
		for (String mail:list) {
			System.out.println(mail);
		}
	}

	private static List<String> getMails() throws IOException {
		URL url = new URL("https://github.com/fnfly2005");
		BufferedReader bufr = new BufferedReader(new InputStreamReader(url.openStream()));
		String regex = "(https?|ftp|file)://[-A-Za-z0-9+&@#/%?=~_|!:,.;]+[-A-Za-z0-9+&@#/%=~_|]";
		
		List<String> list = new ArrayList<String>();
		
		Pattern p = Pattern.compile(regex);
		String line = null;
		while((line=bufr.readLine())!=null) {
			Matcher m = p.matcher(line);
			while(m.find()) {
				list.add(m.group());
			}
		}
		return list;
	}

}
