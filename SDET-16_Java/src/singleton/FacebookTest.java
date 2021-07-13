package singleton;

public class FacebookTest {
	/**
	 * WAP to check the number of object creation for the class
	 * @param args
	 */
	public static void main(String[] args) {
		
		new FacebookUser();
		new FacebookUser();
		new FacebookUser();
		System.out.println(new FacebookUser());
		System.out.println(new FacebookUser());//
		//know the active of user online in fb
		System.out.println("display the count ==="+FacebookUser.UserCount);
		//every time obj create and call constructor
	}
}
