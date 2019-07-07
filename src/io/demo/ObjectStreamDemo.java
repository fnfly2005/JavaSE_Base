package io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


import bean.test.Person;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeDemo();
		readDemo();

	}

	private static void readDemo() throws IOException, ClassNotFoundException {
		System.out.println("java-IO流-ObjectInputStream-对象的反序列化");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persondemo.object"));
		Person p = (Person) ois.readObject();
		ois.close();
		System.out.println(p.getName()+":"+p.getAge());
	}

	private static void writeDemo() throws IOException {
		System.out.println("java-IO流-ObjectOutputStream-对象的序列化");
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persondemo.object"));
		oos.writeObject(new Person("wangcai", 5));
		oos.close();
	}

}
