package Net.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		System.out.println("java-网络编程-IP对象-InetAddress");
		InetAddress ip = InetAddress.getLocalHost();
		InetAddress ip0 = InetAddress.getByName("192.168.1.1");
		InetAddress ip1 = InetAddress.getByName("www.baidu.com");
		System.out.println(ip.getHostName());
		System.out.println(ip0.getHostAddress());
		System.out.println(ip1.getHostAddress());
		
	}

}
