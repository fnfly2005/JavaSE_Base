package Net.demo;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
		
		sendDemo();
	}
	
	private static void sendDemo() throws SocketException,UnknownHostException,IOException {
		System.out.println("java-网络编程-UDP协议-发送端启动...");
		DatagramSocket ds = new DatagramSocket(9999);
		String str = "udp传输演示：哥们来了！";
		
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = 
				new DatagramPacket(buf, buf.length,InetAddress.getByName("127.0.0.1"), 2500);
		
		ds.send(dp);
		
		ds.close();
		
	}

}
