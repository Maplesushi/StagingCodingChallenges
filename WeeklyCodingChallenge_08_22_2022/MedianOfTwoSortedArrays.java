package weeklycodechallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter the length of the first array: ");
		
		int x = myScan.nextInt();
		int[] a = new int[x];
		
		System.out.println("Enter the sorted values for that array: ");
		
		for(int i = 0; i < x; i++) {
			a[i] = myScan.nextInt();
		}
		
		System.out.println("Enter the length of the second array: ");
		
		int y = myScan.nextInt();
		int[] b = new int[y];
		
		System.out.println("Enter the sorted values for that array: ");
		
		for(int i = 0; i < y; i++) {
			b[i] = myScan.nextInt();
		}
		
		myScan.close();
		
		median(a, b);
	}

	static void median(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		
		for(int i = 0; i < c.length; i++) {
			if(i < a.length) {
				c[i] = a[i];
			}
			else {
				c[i] = b[i - a.length];
			}
		}
		
		Arrays.sort(c);
		
		int PosOrNeg = c.length%2;
		
		System.out.print("\nThe median of the two sorted arrays is: ");
		
		if(PosOrNeg == 0) {
			System.out.print(((long)c[c.length/2] + (long) c[(c.length/2) - 1])/2.0);
		}
		else {
			System.out.print(c[(c.length/2)]);
		}
	}
}
