package com.coding.test;

public class Palindrome {
	public static boolean isPalindrome (String str) {
		int i = 0;
		int j = str.length() - 1;
		
		while (i < str.length()) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			System.out.println(str.charAt(i));
			System.out.println(str.charAt(j));
			i++;
			j--;
		}
		return true;
	}
	
	// another way
	public static boolean isPalindromeStr (String str) {
		String revStr = new StringBuilder(str).reverse().toString();
		
		return str.equalsIgnoreCase(revStr) ? true : false;
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("MOM"));
		System.out.println(isPalindromeStr("ABBA"));
	}
}
