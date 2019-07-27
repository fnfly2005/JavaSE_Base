package Net.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadTask implements Runnable {

	private Socket s;
	public UploadTask(Socket s) {
		this.s=s;
	}
	@Override
	public void run() {
		int count = 0;
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip + "....connected");
		try {
			InputStream in = s.getInputStream();
			
			File file = new File(ip+"server.bmp");
			while(file.exists()) {
				count++;
				file = new File(ip+"("+(count)+")server.bmp");
			}
			FileOutputStream fos = new FileOutputStream(file);
			
			byte[] buf = new byte[1024];
			
			int len = 0;
			
			while((len=in.read(buf))!=-1) {
				fos.write(buf, 0, len);
			}
			
			OutputStream out = s.getOutputStream();
			out.write("上传成功".getBytes());
			
			fos.close();
			s.close();
		}
		catch(IOException e) {
			System.out.println(e.toString());
		}
		
	}

}
