package array;

public class SortDesending {
	/**
	 * Sort the given array in descending order
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr= {20,40,80,10,60,40};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]<arr[j]) {//descending order
					int out=arr[i];
					arr[i]=arr[j];
					arr[j]=out;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
