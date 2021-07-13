package collection;

import java.util.ArrayList;

public class ArrayListAddall {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(200);
		list.add(475);
		list.add(45);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(152);
		list2.add(75);
 		list2.add(956);
		
		System.out.println(list);
		System.out.println(list2);
		
		list.addAll(list2);  //list added into other list
		System.out.println(list);
	}

}
