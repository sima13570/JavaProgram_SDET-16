package collection;

import java.util.ArrayList;

public class ArrayListContains {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("skillrary");
		list.add("qspider");
		list.add("seema");
		list.add("qspider");
		
		System.out.println(list.contains("seema"));//boolean return
	}
}
