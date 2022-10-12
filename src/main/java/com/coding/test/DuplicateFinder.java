package com.coding.test;

public class DuplicateFinder {
	public static void getDuplicateElement (int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println("Duplicate Value => " + nums[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] nums = {32, 53, 22, 22, 32, 50};
		getDuplicateElement(nums);
	}
}
