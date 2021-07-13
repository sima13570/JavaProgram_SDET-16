package collection;

import java.util.ArrayList;

public class ArrayListValidate {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("seema");
		list.add("Prati");
		list.add("Shivvo");
		list.add("rita");
	
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).equalsIgnoreCase("prati")) {
				
				System.out.println("Passed");
			}
		}
		
		System.out.println(list);
	}

}
