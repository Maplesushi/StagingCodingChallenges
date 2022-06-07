package com.example.s3demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Weekly_coding_challenge_6_6_2022_triplet {

	public static void main(String[] args) {
		List<Set<Integer>> sets = instantiateData();
		secondMaximum(sets);
	}

	public static List<Set<Integer>> instantiateData() {
		Set<Integer> setIndex = new HashSet<>();
		setIndex.add(3);
		Set<Integer> setOne = new HashSet<>();
		setOne.add(1); setOne.add(2); setOne.add(3);
		Set<Integer> setTwo = new HashSet<>();
		setTwo.add(10); setTwo.add(15); setTwo.add(5);
		Set<Integer> setThree = new HashSet<>();
		setThree.add(100); setThree.add(999); setThree.add(500);

		List<Set<Integer>> mySets = new ArrayList<>();
		mySets.add(setIndex); mySets.add(setOne);
		mySets.add(setTwo); mySets.add(setThree);

		return mySets;
	}

	public static void secondMaximum(List<Set<Integer>> myTripleSets) {
		Object[] numOfSets = myTripleSets.get(0).toArray();
		int index = (int) numOfSets[0];
		for (int i = 1; i <= index; i++) {
			Object[] secondMax = myTripleSets.get(i).toArray();
			int a = (int) secondMax[0];
			int b = (int) secondMax[1];
			int c = (int) secondMax[2];

			if (a < b & b < c) {
				System.out.println(b);
			}
			if (a < c & c < b) {
				System.out.println(c);
			}
			if (b < a & a < c) {
				System.out.println(a);
			}
			if (b < c & c < a) {
				System.out.println(c);
			}
			if (c < a & a < b) {
				System.out.println(a);
			}
			if (c < b & b < a) {
				System.out.println(b);
			}
		}
	}
}


