package com.coding.test;

public class FizzBuzz {
	public static String getFizzBuzz (int num) {
		if (num % 3 == 0 && num % 5 == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if (num % 5 == 0) {
			return "Buzz";
		}
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(getFizzBuzz(4));
	}
}
