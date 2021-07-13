package reverseString;

public class ReverseStringFrom0thIndex {
	
	public static void main(String[] args) {
		
		/**
		 * 	Reverse string with 0th index by using third variable	
		 */
		
		String s="seema";
		
		String rev="";
		for (int i = 0; i < s.length(); i++) {
			
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
}
