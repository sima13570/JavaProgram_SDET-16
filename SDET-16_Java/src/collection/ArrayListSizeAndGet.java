package collection;

import java.util.ArrayList;

public class ArrayListSizeAndGet {
	
	public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("kiran");
		list.add(15300.06);
		list.add(null);
		list.add(true);
		list.add('A');
		list.add(true);  //capacity increase 50%
		list.add("kiran");//dynamic value added
		
		System.out.println(list); ///list of index
		System.out.println(list.size());
		
		for (int i = 0; i < list.size() ; i++) {
			
			System.out.println(list.get(i));
		}
	}
}
