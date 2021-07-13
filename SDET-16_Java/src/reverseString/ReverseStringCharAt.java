package reverseString;

public class ReverseStringCharAt {
	
	public static void main(String[] args) {
		
		/**
		 * reverse without third var and to charrArray 
		 */
		
		String s="aditya";
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.print(s.charAt(i));
		}
	}
}
