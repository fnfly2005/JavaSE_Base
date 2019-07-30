package Net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-URL&URLConnection");
		String str_url = "http://www.baidu.com:80";
		
		URL url = new URL(str_url);
		
		System.out.println("Protocol "+url.getProtocol());
		System.out.println("Host "+url.getHost());
		System.out.println("Port "+url.getPort());
		System.out.println("File "+url.getFile());
		System.out.println("Path "+url.getPath());
		System.out.println("Query "+url.getQuery());
		
		InputStream in = url.openStream();
		byte[] buf = new byte[1024];
		
		int len =0;
		while((len=in.read(buf))!=-1) {
			String text = new String(buf,0,len);
			System.out.print(text);
		}
		
		in.close();
		
		URLConnection conn = url.openConnection();
		
		System.out.println();
		System.out.println(conn);
		
		String value = conn.getHeaderField("Content-Type");
		System.out.println(value);

	}

}
