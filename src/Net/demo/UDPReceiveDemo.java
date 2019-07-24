package Net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiveDemo implements Runnable {

	private DatagramSocket ds;
	public UDPReceiveDemo(DatagramSocket ds) {
		this.ds=ds;
	}
	
	public void run() {
		
			try {
			System.out.println("java-网络编程-UDP协议-接受端启动...");
			while (true) {
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf,buf.length);
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				
				String text = new String(dp.getData(),0,dp.getLength());
				System.out.println(ip+":"+port+":"+text);
				if(text.equals("886")) {
					System.out.println(ip+"...退出聊天室");
				}
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
