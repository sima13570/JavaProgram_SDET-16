package array;

public class SumFirstThreeMin {
	
	public static void main(String[] args) {
		/**
		 * WAP to print sum of first three minimum number
		 */
		int[] arr= {40,50,55,20,46,70};
		
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
		for (int i = 0; i < 3; i++) {//first three min
			sum+=arr[i];
		}
		System.out.println("Sum of first three min : "+sum);
	}
}
