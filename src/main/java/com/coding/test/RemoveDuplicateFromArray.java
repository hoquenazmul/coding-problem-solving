package com.coding.test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {
	public static Set<Integer> removeDuplicate (int[] nums) {
		Set<Integer> uniqueNums = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			uniqueNums.add(nums[i]);
		}
		return uniqueNums;
	}
	
	public static void main(String[] args) {
		int[] nums = {43, 54, 65, 76, 43, 54, 54};
		System.out.println(removeDuplicate(nums));
	}
}
