package Net.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-TCP协议-练习-上传图片服务端");
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(10007);
		while(true) {
			Socket s = ss.accept();
			
			new Thread(new UploadTask(s)).start();
			
		}
		
		
	}

}
