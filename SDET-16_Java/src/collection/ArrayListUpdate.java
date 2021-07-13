package collection;

import java.util.ArrayList;

public class ArrayListUpdate {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("simran");
		list.add(45632);
		list.add('A');
		list.add(null);
		
		System.out.println(list);
		list.add(3, true);   //shift and add the value
		
		System.out.println(list);
	}
}
