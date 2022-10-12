package com.coding.test;

public class ReverseString {
	// reverse string using looping
	public static String getReverseStr (String str) {
		String reverseStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr += str.charAt(i);
		}
		return reverseStr;
	}

	public static void main(String[] args) {
		System.out.println(getReverseStr("United State of America"));
	}
}
