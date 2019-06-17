package runtime.demo;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException {
		System.out.println("java-其他对象API-Runtime类");
		Runtime r = Runtime.getRuntime();
		
		Process p = r.exec("/Applications/Thunder.app");
		p.destroy();

	}

}
