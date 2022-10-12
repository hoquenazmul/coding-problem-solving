package com.coding.test;

public class SwapVariable {
	// one way
	public static void getSwap(int a, int b) {
		System.out.println("Before Swap a => " + a);
		System.out.println("Before Swap b => " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swap a => " + a);
		System.out.println("After Swap b => " + b);
	}
	
	// another way
	public static void getSwapUsingTemp (int a, int b) {
		System.out.println("Before Swap a => " + a);
		System.out.println("Before Swap b => " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swap a => " + a);
		System.out.println("After Swap b => " + b);
	}
	
	
	public static void main(String[] args) {
		getSwap(100, 200);
		
		System.out.println("====================");
		
		getSwapUsingTemp(10, 20);
	}
}
