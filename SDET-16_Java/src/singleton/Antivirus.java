package singleton;

public class Antivirus {
	
	Antivirus() { // This class allow should allow us to create only one object is called Singleton
		System.out.println("Lic Key");
	}
	
	static Antivirus key = new Antivirus();
	
	public static Antivirus getLicenseKey() {
		
		return key;
	}
	
}
