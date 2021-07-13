package collection;

import java.util.Vector;

public class VectorList {

	public static void main(String[] args) {
		
		Vector<Object> list = new Vector<Object>();
		
		
		list.add(100);
		list.add("Seema");
		list.add('K');
		list.add(null);
		list.add(false);
		list.add(412.563);
		
		System.out.println(list);
	}

}
