package collection;

public class TreeSet {

	public static void main(String[] args) {
		
		java.util.TreeSet<Object> set = new java.util.TreeSet<Object>();
		set.add(14);
		set.add(123);
		set.add(111);
		set.add(10);//homogeneous data type otherwise class cast exception
		
		System.out.println(set);//not indexed based
		
		
	}

}
