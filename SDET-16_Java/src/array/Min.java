package array;

public class Min {
	
	public static void main(String[] args) {
		/**
		 * Find the minimum in given array
		 */
		
		int [] arr={20,50,40,60,70};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {//ascending
					
					int out=arr[i];
					arr[i]=arr[j];
					arr[j]=out;
				}
			}
			
		} 
		System.out.println(arr[0]);
	}
}