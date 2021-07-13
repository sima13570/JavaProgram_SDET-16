package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		
		l.add(23);
		l.add(46);
		l.add(10);
		l.add(10);
		l.add(95);
		
		System.out.println(l);//systematic
		
		Collections.sort(l);//ascending order
		System.out.println(l);
		
		Collections.reverse(l);//descending order
		System.out.println(l);
	}

}
