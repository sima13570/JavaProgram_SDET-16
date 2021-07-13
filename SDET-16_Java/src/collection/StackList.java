package collection;

import java.util.Stack;

public class StackList {

	public static void main(String[] args) {
		
		Stack<Object> list = new Stack<Object>();
		list.add("seema");
		list.add(420);
		list.add(null);
		list.add(true);
		
		System.out.println(list);
		System.out.println(list.pop());//reverse fetching and remove
		System.out.println(list);
		System.out.println(list.pop());//reverse fetching and remove
	}

}
