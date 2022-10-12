package com.coding.test;

import java.util.Arrays;

public class MinMaxArray {
	// Get Maximum Number from an Array
	public static int getMax (int[] nums) {
		int maxNum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > maxNum) {
				maxNum = nums[i];
			}
		}
		return maxNum;
	}
	
	// Get Minimum Number from an Array
	public static int getMin (int[] nums) {
		int minNum = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < minNum) {
				minNum = nums[i];
			}
		}
		return minNum;
	}
	
	// Get the Second Max Number from an Array
	public static void getSecondMax (int[] nums) {
		int max = nums[0];
		int secondMax = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				secondMax = max;
				max = nums[i];
			}
		}
		System.out.println("Max Num => " + max + " | Second Max => " + secondMax);
	}
	
	
	public static void main(String[] args) {
		int[] nums = {505, 32, 54, 12, 21, 200, 10, 11};
		System.out.println(getMax(nums));
		System.out.println(getMin(nums));
		
		getSecondMax(nums);
		
		// Get Max & Min Number from an Array Using Stream API
		System.out.println(Arrays.stream(nums).max().getAsInt());
		System.out.println(Arrays.stream(nums).min().getAsInt());
	}
}
