package com.coding.test;

public class Factorial {
	public static int getFactorial (int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static void main (String[] args) {
		System.out.println(getFactorial(4));
	}
}
