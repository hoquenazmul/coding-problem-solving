package com.coding.test;

import java.util.Arrays;

public class WordSeparator {
	public static String getWordFromString (String str) {
		return Arrays.toString(str.split(" "));
	}
	
	public static void main(String[] args) {
		System.out.println(getWordFromString("United State of America"));
	}
}
