package reverseString;

public class ReverseStringThirdVar {
	
	public static void main(String[] args) {
		/**
		 * Reverse using third variable
		 */
		String s="mandya";
		
		char[] ch = s.toCharArray();
		
		String rev="";
		
		for (int i = ch.length-1; i >=0; i--) {
			
			rev=rev+ch[i];//third var
			
		}
		System.out.println(rev);
	}
}
