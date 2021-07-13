package serilization;

import java.io.Serializable;
		// serilizable just indication for backup
public class NfsGame implements Serializable{ //marker interface
    //game level convert java to byte stream and byte to java
	
	String name;
	double score;
	int life;
	int level;
	
}
