package collection;

public class HashMap {

	public static void main(String[] args) {
		java.util.HashMap<String, Integer> map = new java.util.HashMap<String, Integer>();//generic
		
		map.put("chips", 1);
		map.put("biscuit", 2);
		map.put("grocery", 3);
		map.put("medicine", 4);
		map.put("chips", 1);
		
		System.out.println(map);
		System.out.println();
	}

}
