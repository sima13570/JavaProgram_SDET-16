package charAndword;
import java.util.LinkedHashSet;

public class DuplicateWord {
	
	public static void main(String[] args) {
		
		/**
		 * Find duplicate word
		 */
		String sent="Where there is a will there is a way";
		
		String[] word = sent.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < word.length; i++) {
			
			set.add(word[i]);
		}
		System.out.println(set);
		
		for (String wrd : set) {
			int count=0;
			for (int i = 0; i < word.length; i++) {
				
				if(wrd.equals(word[i])) {
					
					count++;
				}
			      
			}
			if (count>1) {
				System.out.println(wrd);
			}
		}
	}
}
