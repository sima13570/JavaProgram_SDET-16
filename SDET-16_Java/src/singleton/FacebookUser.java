package singleton;

public class FacebookUser {
	
	public static int UserCount;//count no of user online
	
	FacebookUser() {  //invoke at the time of object creation
		UserCount++;
	}
}
