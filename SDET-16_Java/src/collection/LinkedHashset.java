package collection;

import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		
		set.add("kiran");
		set.add(450);
		set.add('a');
		set.add(false);
		set.add(null);
		
		System.out.println(set);
	}

}
