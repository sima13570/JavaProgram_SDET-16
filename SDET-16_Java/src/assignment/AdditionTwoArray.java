package assignment;

public class AdditionTwoArray {

	public static void main(String[] args) {
		/**
		 * Addition of two given array
		 */
		
		int a[]= {1,2,3};
		int b[]= {2,4,6};
		
		for (int i = 0; i < a.length; i++) {
			
			int sum=a[i]+b[i];
			System.out.print(sum+" ");
		}
		
	}

}
