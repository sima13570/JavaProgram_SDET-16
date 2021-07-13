package collection;

import java.util.ArrayList;

public class ArrayListRetainAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(142);
		l.add(520);
		l.add(555);
		l.add(853);
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(520);
		l2.add(8745);
		l2.add(555);
		l2.add(45321);
		l2.add(74112);
		
		l.retainAll(l2);//return only duplicate value compare from list2
		System.out.println(l);
		System.err.println(l2);
	
	}

}
