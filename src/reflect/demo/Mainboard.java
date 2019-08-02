package reflect.demo;

public class Mainboard {
	public void run() {
		System.out.println("Mainboard run ");
	}
	
	public void usePCI(PCI p) {
		if(p!=null) {
			p.open();
			p.close();
		}
	}

}
