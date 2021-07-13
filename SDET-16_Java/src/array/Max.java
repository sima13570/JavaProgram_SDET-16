package array;

public class Max {
	/**
	 * Find the maximum in the given array
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr= {20,50,60,40,60};
		
		for (int i = 0; i < arr.length; i++) {//0th index 
			
			for (int j = i+1; j < arr.length; j++) {  //immediate next index
				
				if (arr[i]>arr[j]) {//ascending order
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[arr.length-1]);//last index
	
	}
}
