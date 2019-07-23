package Net.demo;

import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPChatDemo {

	public static void main(String[] args) throws SocketException {
		System.out.println("java-网络编程-UDP协议-聊天程序");
		DatagramSocket send = new DatagramSocket();
		
		DatagramSocket rece = new DatagramSocket(2500);
		
		new Thread(new UDPSendDemo(send)).start();
		new Thread(new UDPReceiveDemo(rece)).start();
	}

}
