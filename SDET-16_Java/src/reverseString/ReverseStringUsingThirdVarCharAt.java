package reverseString;

public class ReverseStringUsingThirdVarCharAt {
	
	public static void main(String[] args) {
		/**
		 * Reverse string with charAt third variable 
		 */
		String s="seema";
		
		String rev="";
		
		for (int i = s.length()-1; i >=0; i--) {
			
			rev=rev+s.charAt(i);//third var and char at
		}
		System.out.println(rev);
	}
}
