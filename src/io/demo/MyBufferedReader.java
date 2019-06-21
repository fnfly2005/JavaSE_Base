package io.demo;

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	/*
	 * 自定义读取缓冲区，模拟一个BufferedReader
	 * java-IO流-字符流-缓冲区-自定义MyBufferedReader-read方法
	 * java-IO流-字符流-缓冲区-自定义MyBufferedReader-readLine方法
	 */

	private FileReader r;
	
	private char[] buf = new char[1024];//定义一个数组作为缓冲区
	
	private int pos = 0; //指针，用于操作数组中元素，当操作到最后一个元素后，指针归零
	
	private int count = 0; //计数器，用于记录缓冲区中的数据个数
	

	public MyBufferedReader(FileReader r) {
		this.r = r;
		
	}
	
	public int myRead() throws IOException
	{
		// 从源中获取一批数据到缓冲区中，需要先做判断，只有计数器为0时，才需要从源中获取数据
		if(count==0)
		{
			count = r.read(buf);
			pos = 0;//每次获取数据到缓冲区后，角标归零
		}
		if(count<0)
		{
			return -1;
		}		
		char ch = buf[pos];
		pos++;
		count--;
		
		return ch;
	}

	public String myReadLine() throws IOException
	{
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch = myRead())!=-1)
		{
			if (ch == '\r') 
			{
				continue;
			}
			if(ch=='\n')
			{
				return sb.toString();
			}
			sb.append((char)ch);//将从缓冲区中读到的字符，存储到缓存行数据的缓冲区中
		}
		if(sb.length()!=0)
		{
			return sb.toString();//避免最后一行没返回
		}
		return null;

	}

	public void myClose() throws IOException {
		r.close();
	}
}
