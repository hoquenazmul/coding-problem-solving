package com.coding.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
	public static List<Integer> getFibo (int num) {
		List<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		for (int i = 2; i <= num; i++) {
			list.add(list.get(i - 1) + list.get(i - 2));
		}
		return list;
	}
	
	public static void main(String[] args) {
		System.out.println(getFibo(10));
	}
}
