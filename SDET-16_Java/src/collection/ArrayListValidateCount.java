package collection;

import java.util.ArrayList;

public class ArrayListValidateCount {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("seema");
		list.add("Prati");
		list.add("Shivvo");
		list.add("rita");
		list.add("prati");
		
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).equalsIgnoreCase("prati")) {
				count++;
				System.out.println("Passed");
				
			}
		}
		System.out.println("Total time repeating "+count);
		System.out.println(list);
			
	}
}
