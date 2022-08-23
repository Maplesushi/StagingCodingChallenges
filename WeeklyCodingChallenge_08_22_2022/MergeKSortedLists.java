package weeklycodechallenge;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeKSortedLists {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.print("Enter number of lists to be merged: ");
		int k = myScan.nextInt();
		LinkedList<Integer>[] arr = new LinkedList[k];
		for(int i = 0; i < k; i++) {
			System.out.println("Enter # of values in the following list to be added: ");
			int num = myScan.nextInt();
			System.out.println("Enter values for list #" + (i+1) + " separated by spaces: ");
			LinkedList<Integer> myList = new LinkedList<>();
			for(int j = 0; j < num; j++) {
				int a = myScan.nextInt();
				myList.add(a);
			}
			arr[i] = myList;
		}
		myScan.close();
		System.out.println(merger(arr));
	}

	static LinkedList<Integer> merger(LinkedList<Integer>[] a){
		LinkedList<Integer> newList = new LinkedList<>();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].size(); j++) {
				newList.add(a[i].get(j));
			}
		}
		Collections.sort(newList);
		return newList;
	}
}
