package charAndword;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {

		String str = "As you sow so shall you reap";

		String[] word = str.split(" ");

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < word.length; i++) {
			
			set.add(word[i]);
		}
		
		for (String wrd : set) {
			System.out.println(wrd);
		}
	}
}
