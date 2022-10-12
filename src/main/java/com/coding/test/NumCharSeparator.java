package com.coding.test;

public class NumCharSeparator {
	public static void getNumCharFromString (String text) {
		String letters = text.replaceAll("[^A-Za-z]", "");
		String nums = text.replaceAll("[^0-9]", "");
		System.out.println(letters);
		System.out.println(nums);
	}
	
	// another way to separate
	public static void separateCharNum (String str) {
		String alphabeticString = "";
		String numericString = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				numericString += str.charAt(i);
			} else {
				alphabeticString += str.charAt(i);
			}
		}
		
		System.out.println(alphabeticString);
		System.out.println(numericString);
	}
	
	public static void main(String[] args) {
		getNumCharFromString("Hello20World22");
		separateCharNum("Hello20World22");
	}
}
