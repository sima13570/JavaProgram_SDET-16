package practice;

public class InitCapsProgram {
	
	public static void main(String[] args) {
		
		String s="my name is seema";
		
		String[] arr = s.split(" ");
		String rev="";
		for (String word : arr) {
			
			String FstWrd = word.substring(0,1).toUpperCase();
			String SecWrd=word.substring(1);
			rev=rev+FstWrd+SecWrd+" ";
			
	
		}
		System.out.println(rev);
		
	}
}
