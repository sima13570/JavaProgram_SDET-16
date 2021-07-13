 package array;

public class SumLastThreeMin {
	/**
	 * WAP to print sum of last three minimum number
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arr= {50,40,60,10,75,15,772,42};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if (arr[i]<arr[j]) {//ascending
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int sum=0;
		for (int i = arr.length-1; i>arr.length-4  ; i--) {// last three min value
			sum+=arr[i];
		}
		System.out.println("Sum of last three min : "+sum);
	}
}
