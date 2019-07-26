package Net.demo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class UploadPicClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("java-网络编程-TCP协议-练习-上传图片客户端");
		
		Socket s = new Socket("127.0.0.1",10006);
		
		FileInputStream fis = new FileInputStream("test.bmp");
		
		OutputStream os = s.getOutputStream();
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=fis.read(buf))!=-1) {
			os.write(buf,0,len);
		}
		
		s.shutdownOutput();
		
		InputStream in = s.getInputStream();
		byte[] bufin = new byte[1024];
		int lenin = in.read(bufin);
		String str = new String(bufin,0,lenin);
		
		System.out.println(str);
		
		fis.close();
		s.close();

	}

}
