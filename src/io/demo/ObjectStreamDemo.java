package io.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import bean.test.Person;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-IO流-ObjectOutputStream-对象的序列化");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persondemo.object"));
		oos.writeObject(new Person("wangcai", 5));
		oos.close();

	}

}
