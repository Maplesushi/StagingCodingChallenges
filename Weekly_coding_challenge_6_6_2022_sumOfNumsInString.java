package com.example.s3demo;

public class Weekly_coding_challenge_6_6_2022_sumOfNumsInString {

	public static void main(String[] args) {
		Object[] input = inputInstantiator();
		sumOfDigits(input);
	}

	public static Object[] inputInstantiator() {
		Object[] input = new Object[4];
		input[0] = Integer.valueOf(3);
		input[1] = "ab1231da";
		input[2] = "1b1r319a";
		input[3] = "1bm56b9a";
		return input;
	}

	public static void sumOfDigits(Object[] input) {
		int numOfIterations = (int) input[0];
		System.out.println("Number of iterations: " + numOfIterations + "\n");
		for (int i = 0; i < numOfIterations; i++) {
			char[] charArray = input[i + 1].toString().toCharArray();
			int charArrayLength = charArray.length;
			int sum = 0;
			for (int t = 0; t < charArrayLength; t++) {
				if (charArray[t] > 47 & charArray[t] < 58) {
					sum = sum + Character.getNumericValue(charArray[t]);
				}
			}
			System.out.println(sum);
		}
	}
}
