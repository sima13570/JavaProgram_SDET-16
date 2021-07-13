package collection;

public class HashSet {

	public static void main(String[] args) {
		
		java.util.HashSet<Object> set = new java.util.HashSet<Object>();
		set.add(10);
		set.add("seema");
		set.add('A');
		set.add(1200.23);
		set.add(null);
		set.add(null);//not allow duplicate
		
		System.out.println(set);
		
	}

}
