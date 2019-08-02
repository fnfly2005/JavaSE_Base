package reflect.demo;

public class NetCard implements PCI {

	@Override
	public void open() {
		System.out.println("Net open");
	}

	@Override
	public void close() {
		System.out.println("Net close");
	}

}
