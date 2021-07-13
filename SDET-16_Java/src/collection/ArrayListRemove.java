package collection;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		
		ArrayList<Double> l = new ArrayList<Double>();
		
		l.add(523.2);
		l.add(5530.0);
		l.add(75.4);
		l.add(4336.45);
		
		System.err.println(l.size());
		System.out.println(l);
		
		l.remove(2);             //remove
		System.err.println(l.size());
		System.out.println(l);
		
		ArrayList<Object> l2 = new ArrayList<Object>();
		l2.add(563);
		l2.add(752);
		l2.add(74);
		
		System.out.println(l2);
		l2.addAll(l);            //addAll
		System.err.println(l2);
		
		l2.removeAll(l);            //removeAll
		System.err.println(l2.size());
		System.out.println(l2);
		
		
	}

}
