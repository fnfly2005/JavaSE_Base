package io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-转换流");
		String ch = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		while((ch=br.readLine())!=null)
		{
			if("over".equals(ch))
				break;
			bw.write(ch.toUpperCase());
			bw.newLine();
			bw.flush();
		}

	}

}
