package com.coding.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemoverFromList {
	public static Set<Integer> removeDuplicate (List<Integer> li) {
		return new HashSet<Integer>(li);
	}
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		numList.add(32);
		numList.add(22);
		numList.add(32);
		numList.add(22);
		System.out.println(removeDuplicate(numList));
	}
}
