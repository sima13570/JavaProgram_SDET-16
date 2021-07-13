package array;

public class SecondMin {
	
	public static void main(String[] args) {
		/**
		 * Find the second max in the given array
		 */
		
		int[] arr= {51,84,440,60,42,70};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[1]);
		
	}
}
