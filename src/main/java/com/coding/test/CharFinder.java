package com.coding.test;

public class CharFinder {
	public static void getSpecificChar (String str, char letter) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				count++;
				System.out.println("Find " + letter + " => " + count);
			}
		}
	}
	
	public static void main(String[] args) {
		getSpecificChar("United State of America", 'e');
	}
}
