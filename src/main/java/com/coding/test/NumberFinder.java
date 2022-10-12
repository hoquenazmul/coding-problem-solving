package com.coding.test;

public class NumberFinder {
	// print that number which has 3 from 10 to 30
	public static void getSpecificNumber (int num) {
		String strNum = String.valueOf(num);
		for (int i = 10; i <= 30; i++) {
			if (String.valueOf(i).contains(strNum)) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		getSpecificNumber(3);
	}
}
