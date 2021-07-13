package assignment;

public class AlphaNumericSpecialChar {

	public static void main(String[] args) {
		
		/**
		 * Separate alpha, numeric and special
		 */
		
		String s="abz@123#4";
		
		char[] ch = s.toCharArray();
		
		String numeric="";
		String alpha="";
		String special="";
		for (int j = 0; j <122 ; j++) {
			char k=(char) j;
			 
		for (int i = 0; i < ch.length; i++) {
			
				if (k>47 && k< 58 ) {   //numeric digit
				
					if (ch[i]==k) {
						numeric=numeric+k;
					}
					System.out.println(numeric);
				}
				
				/*
				 * else if (k>65 && k<122) { if (ch[i]==k) { numeric=numeric+k; }
				 * 
				 * }
				 */
				
				/*
				 * else { if (ch[i]==k) { special=special+k; }
				 * 
				 * }
				 */
			}	
		}
		System.out.println("Numeric "+numeric);
		//System.out.println("Alphabet "+alpha);
		//System.out.println("Special "+special);
		
	}

}
