package practice;

public class SwapUsingWithoutThirdVar {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		a=a+b;//30
		b=a-b;//30-20
		a=a-b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
}
