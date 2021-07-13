package charAndword;
import java.util.HashSet;

public class DuplicateChar {

	public static void main(String[] args) {

		String s = "seema";

		// step 1 convert the given string into array

		char[] ch = s.toCharArray();

		// step 2 create coll to find unique character of string
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < ch.length; i++) {

			set.add(ch[i]);
		}

		System.out.println(set);
		// step 3 compare each char of set with all char of array
		for (Character chr : set) {
			int count = 0;
			for (int i = 0; i < ch.length; i++) {

				if (chr == ch[i]) {
					count++;
				}
			}
			// step4 print char and no of occurence
			if (count > 1) {
				System.out.println(chr + " = " + count);
			}

		}
	}
}
