package reflect.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IOException, ReflectiveOperationException {
		System.out.println("java-反射机制-练习");
		Mainboard mb = new Mainboard();
		mb.run();
		
		File configFile = new File("pci.properties");
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream(configFile);
		
		properties.load(fis);
		
		for (int x =0;x<properties.size();x++) {
			String pciNameString = properties.getProperty("pci"+(x+1));
			Class clazz = Class.forName(pciNameString);
			
			PCI pci = (PCI) clazz.newInstance();
			
			mb.usePCI(pci);
		}
		

	}

}
