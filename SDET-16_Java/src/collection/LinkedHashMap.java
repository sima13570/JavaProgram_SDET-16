package collection;

public class LinkedHashMap {

	public static void main(String[] args) {
		
		java.util.LinkedHashMap<String, Integer> map = new java.util.LinkedHashMap<String, Integer>();
		
		map.put("iPhone", 1);
		map.put(null, null);
		map.put("laptop", 5);
		map.put("Earbud", 8);
		
		System.out.println(map);
	}

}
