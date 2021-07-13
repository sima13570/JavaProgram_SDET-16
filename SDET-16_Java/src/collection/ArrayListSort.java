package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();
		
		l.add("mobile");
		l.add("books");
		l.add("headphone");
		l.add("aquarium");
		l.add("pen");
		l.add("kettle");
		
		System.out.println(l);
		Collections.sort(l);// Collections method sort()
		System.err.println(l);
	}

}
