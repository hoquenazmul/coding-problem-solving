# JAVA Coding Test

## Table of Contents

1. [Swap Variable](#swap-variable)
2. [Character Finder](#character-finder)
3. [Word Separator](#word-separator)
4. [Number Finder](#number-finder)
5. [Reverse String](#reverse-string)
6. [Separate Char and Nums from String](#separate-char-and-nums-from-string)
7. [FizzBuzz](#fizzbuzz)
8. [Prime Number Checker](#prime-number-checker)
9. [Palindrome](#palindrome)
10. [Fibonacci](#fibonacci)
11. [Factorial](#factorial)
12. [MinMax Finder from Array](#minmax-finder-from-array)
13. [MinMax Finder from List](#minmax-finder-from-list)
14. [Remove Duplicate from Array](#remove-duplicate-from-array)
15. [Remove Duplicate from List](#remove-duplicate-from-list)
16. [Duplicate Element Finder](#duplicate-element-finder)
17. [Print MultiDimensional Array](#print-multidimensional-array)

## Swap Variable
```java
// one way
public static void getSwap(int a, int b) {
	System.out.println("Before Swap a => " + a);
	System.out.println("Before Swap b => " + b);
	
	a = a + b;
	b = a - b;
	a = a - b;
	
	System.out.println("After Swap a => " + a);
	System.out.println("After Swap b => " + b);
}

// another way using temp variable
public static void getSwapUsingTemp (int a, int b) {
	System.out.println("Before Swap a => " + a);
	System.out.println("Before Swap b => " + b);
	
	int temp = a;
	a = b;
	b = temp;
	
	System.out.println("After Swap a => " + a);
	System.out.println("After Swap b => " + b);
}

public static void main(String[] args) {
	getSwap(100, 200);
	System.out.println("====================");
	getSwapUsingTemp(10, 20);
}
```
**[⬆ back to top](#table-of-contents)**

## Character Finder
```java
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
```
**[⬆ back to top](#table-of-contents)**

## Word Separator
```java
public static String getWordFromString (String str) {
	return Arrays.toString(str.split(" "));
}

public static void main(String[] args) {
	System.out.println(getWordFromString("United State of America"));
}
```
**[⬆ back to top](#table-of-contents)**

## Number Finder
```java
// print that number which has 3 from 10 to 30
public static void getSpecificNumber (int num) {
	String strNum = String.valueOf(num);
	for (int i = 10; i <= 30; i++) {
		if (String.valueOf(i).contains(strNum)) {
			System.out.println(i);
		}
	}
}

public static void main(String[] args) {
	getSpecificNumber(3);
}
```
**[⬆ back to top](#table-of-contents)**

## Reverse String
```java
// one way => reverse string using looping
public static String getReverseStr (String str) {
	String reverseStr = "";
	for (int i = str.length() - 1; i >= 0; i--) {
		reverseStr += str.charAt(i);
	}
	return reverseStr;
}

// another way => reverse string using StringBuffer
public static String getReverseString (String str) {
	return new StringBuffer(str).reverse().toString();
}

public static void main(String[] args) {
	System.out.println(getReverseStr("United State of America"));
	System.out.println(getReverseString("United State of America"));
}
```
**[⬆ back to top](#table-of-contents)**

## Separate Char and Nums from String
```java
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
```
**[⬆ back to top](#table-of-contents)**

## FizzBuzz
```java
public static String getFizzBuzz (int num) {
	if (num % 3 == 0 && num % 5 == 0) {
		return "FizzBuzz";
	} else if (num % 3 == 0) {
		return "Fizz";
	} else if (num % 5 == 0) {
		return "Buzz";
	}
	return null;
}

public static void main(String[] args) {
	System.out.println(getFizzBuzz(4));
}
```
**[⬆ back to top](#table-of-contents)**

## Prime Number Checker
```java
public static boolean isPrime(int num) {
	for (int i = 2; i < num/2; i++) {
		if (num % i == 0) {
			return false;
		}
	}
	return true;
}
public static void main(String[] args) {
	System.out.println(isPrime(17));
}
```
**[⬆ back to top](#table-of-contents)**

## Palindrome
```java
public static boolean isPalindrome (String str) {
	int i = 0;
	int j = str.length() - 1;
	
	while (i < str.length()) {
		if (str.charAt(i) != str.charAt(j)) {
			return false;
		}
		System.out.println(str.charAt(i));
		System.out.println(str.charAt(j));
		i++;
		j--;
	}
	return true;
}

// another way
public static boolean isPalindromeStr (String str) {
	String revStr = new StringBuilder(str).reverse().toString();
	
	return str.equalsIgnoreCase(revStr) ? true : false;
}

public static void main(String[] args) {
	System.out.println(isPalindrome("MOM"));
	System.out.println(isPalindromeStr("ABBA"));
}
```
**[⬆ back to top](#table-of-contents)**

## Fibonacci
```java
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
```
**[⬆ back to top](#table-of-contents)**

## Factorial
```java
public static int getFactorial (int num) {
	int fact = 1;
	for (int i = 2; i <= num; i++) {
		fact *= i;
	}
	return fact;
}

public static void main (String[] args) {
	System.out.println(getFactorial(4));
}
```
**[⬆ back to top](#table-of-contents)**

## MinMax Finder from Array
```java
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
```
**[⬆ back to top](#table-of-contents)**

## MinMax Finder from List
```java
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
```
**[⬆ back to top](#table-of-contents)**

## Remove Duplicate from Array
```java
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
```
**[⬆ back to top](#table-of-contents)**

## Remove Duplicate from List
```java
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
```
**[⬆ back to top](#table-of-contents)**

## Duplicate Element Finder
```java
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
```
**[⬆ back to top](#table-of-contents)**

## Print MultiDimensional Array
```java
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
```
**[⬆ back to top](#table-of-contents)**

