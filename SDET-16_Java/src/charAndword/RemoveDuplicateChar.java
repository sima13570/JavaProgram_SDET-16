package charAndword;
import java.util.LinkedHashSet;

public class RemoveDuplicateChar {
	
	public static void main(String[] args) {
		
		String s="welcome";
		//step 1 : convert given string into char array
		char[] ch = s.toCharArray();
		
		//step 2 : find only unique char by creating set coll
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			
			set.add(ch[i]);
		}
		//step 3 : print value of set
		for (Character chr : set) {
			
			System.out.print(chr+" ");
		}
	}
}
