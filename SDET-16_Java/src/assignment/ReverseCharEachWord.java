package assignment;

public class ReverseCharEachWord {
	
	public static void main(String[] args) {
		
		/**
		 * Reverse the char of each word in the given string
		 */
		
		String s="welcome to india";
		
		String[] word = s.split(" ");//split sent into word
		
		for (String wrd : word) {    //each word
			
			String rev="";
			char[] ch = wrd.toCharArray(); //word convert into char
			
			for (int i = ch.length-1; i >=0; i--) {
				
				rev=rev+ch[i];
				
			}
			System.out.print(rev+" ");//reverse print
			
		}
	}
}

/*
 * o/p : emoclew ot aidni
 */