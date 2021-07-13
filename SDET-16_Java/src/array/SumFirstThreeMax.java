package array;

public class SumFirstThreeMax {
	
	public static void main(String[] args) {
		/**
		 * WAP to print Sum of first three max 
		 */
		
		int[] arr= {120,70,80,73,90,45};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]<arr[j]) {//descending
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i = 0; i < 3; i++) {//first three max
			sum+=arr[i];
		}
		System.out.println("Sum of first three max : "+sum);
	}
}
