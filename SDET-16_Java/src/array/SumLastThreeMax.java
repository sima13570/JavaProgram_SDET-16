package array;

public class SumLastThreeMax {
	
	public static void main(String[] args) {
		/**
		 * WAP to print sum of last three max number
		 */
		int[] arr= {10,80,40,70,60,485};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]>arr[j]) {//ascending
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i = arr.length-1; i > arr.length-4; i--) {//last three max
			sum+=arr[i];
		}
		System.out.println("Sum of last three max : "+sum);
	}
}
