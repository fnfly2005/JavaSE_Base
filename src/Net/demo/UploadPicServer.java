package Net.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {

	public static void main(String[] args) throws IOException {
		System.out.println("java-网络编程-TCP协议-练习-上传图片服务端");
		ServerSocket ss = new ServerSocket(10006);
		
		Socket s = ss.accept();
		
		InputStream in = s.getInputStream();
		
		String ip = s.getInetAddress().getHostAddress();
				
		FileOutputStream fos = new FileOutputStream(new File(ip+"server.bmp"));
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=in.read(buf))!=-1) {
			fos.write(buf, 0, len);
		}
		
		OutputStream out = s.getOutputStream();
		out.write("上传成功".getBytes());
		
		fos.close();
		s.close();
		ss.close();

	}

}
