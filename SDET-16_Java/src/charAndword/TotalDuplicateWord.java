package charAndword;
import java.util.LinkedHashSet;

public class TotalDuplicateWord {
		/**
		 *Count Total duplicate word
		 * * @param args
		 */
		public static void main(String[] args) {

			String sent = "Where there is a will there is a way ";

			String[] word = sent.split(" ");

			LinkedHashSet<String> set = new LinkedHashSet<String>();
			for (int i = 0; i < word.length; i++) {

				set.add(word[i]);
			}
			System.out.println(set);
			
			int totalCount=0;  //Global variable
			for (String wrd : set) {
				int count = 0;
				for (int i = 0; i < word.length; i++) {

					if (wrd.equalsIgnoreCase(word[i])) {

						count++;
					}

				}
				if (count > 1) {
					totalCount++;//increment golbal var
				}
			}
			System.out.println("Total Duplicate : "+totalCount);
		}


}
