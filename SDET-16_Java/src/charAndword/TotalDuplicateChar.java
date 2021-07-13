package charAndword;
import java.util.LinkedHashSet;

public class TotalDuplicateChar {
		/**
		 * Total Duplicate of Char
		 * * @param args
		 */
		public static void main(String[] args) {

			String s = "malyalam";

			 char[] ch = s.toCharArray();

			LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for (int i = 0; i < ch.length; i++) {

				set.add(ch[i]);
			}
			System.out.println(set);
			
			int totalCount=0;//Global var
			for (char chr : set) {
				int count = 0;
				for (int i = 0; i < ch.length; i++) {

					if (chr==ch[i]) {

						count++;
					}

				}
				if (count >1) {
					totalCount++;
				}
			}
			System.out.println(totalCount);
		}

}
