package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NfsGameDay1 {
	//stored the backup java convert into byte stream  i.e  
	public static void main(String[] args) throws IOException {

		NfsGame user1 = new NfsGame();
		user1.name = "ram";
		user1.score = 10000;
		user1.level = 150;
		user1.life = 0;

		FileOutputStream file = new FileOutputStream("./backup.ser");//physical file
		ObjectOutputStream objOut = new ObjectOutputStream(file);//store file object 
		objOut.writeObject(user1);//serilization
		//objOut.flush();
		System.out.println("==== Backup File Stored ====");
		
	}
}
