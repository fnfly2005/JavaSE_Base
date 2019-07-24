package Net.demo;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo implements Runnable {

	private DatagramSocket ds;
	
	public UDPSendDemo(DatagramSocket ds){
		this.ds=ds;
	}
	
	public void run() {
		try {
			System.out.println("java-网络编程-UDP协议-发送端启动...");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String str = null;
			while((str=br.readLine())!=null){
				byte[] buf = str.getBytes();
				DatagramPacket dp = 
						new DatagramPacket(buf, buf.length,InetAddress.getByName("192.168.31.255"), 2500);			
				ds.send(dp);
				if("886".equals(str)) {
					break;
				}
			}			
			ds.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
