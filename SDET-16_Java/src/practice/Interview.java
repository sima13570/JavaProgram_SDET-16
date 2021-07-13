package practice;

import java.util.LinkedHashSet;

public class Interview {

	public static void main(String[] args) {
		
		String s="seema live in delhi";
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		for (Character chr : set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				
				if (ch[i]==chr) {
					count++;
				}
			
			}
			System.out.println(chr+"="+count);
			
		}
	}

}
// op : s=1, e=3
