package com.coding.test;

public class MultidimentionalArrayPrinter {
	public static void printMultiDimentionalArray (int[][] nums) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] nums = {{32, 54, 65, 76},{90, 87, 63, 30}};
		printMultiDimentionalArray(nums);
	}
}
