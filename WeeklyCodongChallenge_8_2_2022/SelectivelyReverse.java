package assignedon8_2_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectivelyReverse {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Size of Array: ");
		int size = myScan.nextInt();
		int[] arr = new int[size];
		System.out.println("\nEnter array values: ");
		for(int i = 0; i < size; i++) {
			arr[i] = myScan.nextInt();
		}
		System.out.println("Enter reverse coefficient: ");
		int rc = myScan.nextInt();
		myScan.close();
		System.out.println("\n");
		if(rc == 0) {
			for(int i = 0; i < size; i++) {
				System.out.println("" + arr[i] + " ");
			}
		}
		else if (rc > size) {
			for(int i = 0; i < size; i++) {
				System.out.println("" + arr[size - 1 - i] + " ");
			}
		}
		else {
			List<Integer> myList = reverser(arr, rc);
			for(int i = 0; i < myList.size(); i++) {
				System.out.println(myList.get(i) + " ");
			}
		}
	}

	static List<Integer> reverser(int[] arr, int rc) {
		List<Integer> newarr = new ArrayList<>();
		int size = arr.length;
		int r = 0;
		for(int i = 0; i < arr.length; i++) {
			if(rc%(i + 1) == 0) {
				for(int j = i; j >= 0; j--) {
					newarr.add(arr[j]);
				}
				size -= rc;
			}
			if(rc > size) {
				r = i;
				break;
			}
		}
		for(int i = arr.length-1; i >= r; i--) {
			newarr.add(arr[i]);
		}
		return newarr;
	}
}
