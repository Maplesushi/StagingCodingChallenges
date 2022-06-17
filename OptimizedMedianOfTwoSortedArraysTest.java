package assignedon06_13_22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OptimizedMedianOfTwoSortedArraysTest {

	@Test
	void test0() {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test1() {
		int[] nums1 = {1,2,4,5,7,8};
		int[] nums2 = {2,3,5,6,8,9};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test2() {
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test3() {
		int[] nums1 = {1,2};
		int[] nums2 = {};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test4() {
		int[] nums1 = {};
		int[] nums2 = {3,4};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test5() {
		int[] nums1 = {1,1,2,2,3,3,4,4};
		int[] nums2 = {2,2,3,3,4,4,5,5};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test6() {
		int[] nums1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
		int[] nums2 = {0,0,0,0,0,0,0,0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}
	@Test
	void test7() {
		int[] nums1 = {1,2,98,99,148,149,198,199,998,999};
		int[] nums2 = {49,50,149,150,249,250,349,350,449};
		System.out.println(OptimizedMedianOfTwoSortedArrays.getMedian(nums1, nums2));
	}

}
