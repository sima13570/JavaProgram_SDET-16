package array;

public class Spearate01InArray {
	/**
	 * Separate 0 and 1 value
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a= {0,1,0,1,1,0,0,1};
		int[] b= new int[a.length];
		
		int j=0;          //for starting index
		int k=b.length-1; //for last index
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]==0) {
				
				b[j]=a[i];
				j++;
			
			}else {
			
				b[k]=a[i];
				k--;
			}
		
		}
		
		//to read values
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}	
}