package io.demo;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class PipedStreamDemo {

	

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-管道流-PipedStream");
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		
		pis.connect(pos);
		
		new Thread(new Input(pis)).start();
		new Thread(new Output(pos)).start();


	}

}

class Output implements Runnable {

	private PipedOutputStream pos;
	Output(PipedOutputStream pos) {
		// TODO Auto-generated constructor stub
		this.pos= pos;	
	}

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			pos.write("HI,管道来了!".getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Input implements Runnable {

	private PipedInputStream pis;
	Input(PipedInputStream pis) {
		// TODO Auto-generated constructor stub
		this.pis = pis;
	}

	@Override
	public void run() {
		
		try {
			byte[] buf = new byte[1024];
			int len = pis.read(buf);
			String s = new String(buf, 0, len);
			System.out.println(s);
			pis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}