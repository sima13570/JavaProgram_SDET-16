package array;

public class SecondMax {
	
	public static void main(String[] args) {
		/**
		 * Find the second max in the given array
		 */
		int[] arr= {10,80,40,60,10,45,71};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					int out=arr[i];
					arr[i]=arr[j];
					arr[j]=out;
				}
			}
		}
		System.out.println(arr[arr.length-2]);//last second
	}
}
