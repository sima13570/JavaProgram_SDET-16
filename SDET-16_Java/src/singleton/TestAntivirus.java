package singleton;

public class TestAntivirus {
	
	public static void main(String[] args) {
		
		Antivirus user1= Antivirus.getLicenseKey();
		
		System.out.println(user1);
	}
}
