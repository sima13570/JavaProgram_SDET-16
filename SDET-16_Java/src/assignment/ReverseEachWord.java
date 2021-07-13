package assignment;

public class ReverseEachWord {
	
	public static void main(String[] args) {
		/**
		 * Reverse the each word of given string
		 */
		
		String s="welcome to tyss comp";
		
		String[] wrd = s.split(" ");
		
		String rev="";
		
			for (int i = 0; i < wrd.length; i++) {
				
				rev=wrd[i]+rev;
				
			}
			System.out.println(rev);
	}
}
/*
 *  o/p : comp tyss to welcome 
 */
