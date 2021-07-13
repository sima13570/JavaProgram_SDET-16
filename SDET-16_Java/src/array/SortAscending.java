package array;

public class SortAscending {

	public static void main(String[] args) {
		/**
		 * Sort the given array in ascending order
		 * */

		int[] arr= {20, 10,50,60,40,30};

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {

				if (arr[i]>arr[j]) { //ascending

					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}