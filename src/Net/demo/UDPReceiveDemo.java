package Net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveDemo {

	public static void main(String[] args) throws IOException {
		receiveDemo();

	}
	private static void receiveDemo() throws IOException {
		System.out.println("java-网络编程-UDP协议-接受端启动...");
		DatagramSocket ds = new DatagramSocket(2500);
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf,buf.length);
		
		ds.receive(dp);
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		
		String text = new String(dp.getData(),0,dp.getLength());
		System.out.println(ip+":"+port+":"+text);
		ds.close();
	}
}
