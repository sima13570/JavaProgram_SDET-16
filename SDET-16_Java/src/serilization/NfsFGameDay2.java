package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class NfsFGameDay2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 
		FileInputStream file = new FileInputStream("./backup.ser");
		
		ObjectInputStream objIn = new ObjectInputStream(file);
		
		NfsGame user= (NfsGame) objIn.readObject();//deserilization
		
		System.out.println(user.name);
		System.out.println(user.score);
		System.out.println(user.life);
		System.out.println(user.level);
		
	}

}
