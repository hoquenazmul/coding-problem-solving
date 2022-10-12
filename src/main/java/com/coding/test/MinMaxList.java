package com.coding.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxList {
	// Get Maximum Number from a List
	public static int getMax(List<Integer> nums) {
		int maxNum = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > maxNum) {
				maxNum = nums.get(i);
			}
		}
		return maxNum;
	}

	// Get Minimum Number from a List
	public static int getMin(List<Integer> nums) {
		int minNum = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) < minNum) {
				minNum = nums.get(i);
			}
		}
		return minNum;
	}

	// Get the Second Max Number from a List
	public static void getSecondMax(List<Integer> nums) {
		int max = nums.get(0);
		int secondMax = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) > max) {
				secondMax = max;
				max = nums.get(i);
			}
		}
		System.out.println("Max Num => " + max + " | Second Max => " + secondMax);
	}

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(39);
		nums.add(100);
		nums.add(11);
		nums.add(50);
		System.out.println(getMax(nums));
		System.out.println(getMin(nums));

		getSecondMax(nums);

		// Get Max & Min Number from an List Using Collections
		System.out.println(Collections.max(nums));
		System.out.println(Collections.min(nums));
	}
}
