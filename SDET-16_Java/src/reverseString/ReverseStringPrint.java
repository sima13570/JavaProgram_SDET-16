package reverseString;

public class ReverseStringPrint {
	public static void main(String[] args) {
		/**
		 * Reverse string using print method
		 */
		String s ="mandya";
		
		char[] ch = s.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			
			System.out.print(ch[i]); //print method
		}
	}
}
