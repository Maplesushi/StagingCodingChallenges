import java.util.Arrays;

public class LargestGap {

	public static void main(String[] args) {
		int[] ar = sort(new int[]{ 9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5 });
		int[] arr = sort(new int[]{ 14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7 });
		int[] arry = sort(new int[]{ 13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9 });
		getgap(ar);
		getgap(arr);
		getgap(arry);
	}
	static int[] sort(int[] arry) {
		Arrays.sort(arry);
		return arry;
	}
	static void getgap(int[] a) {
		int result = 0;
		for (int i = 1; i < a.length; i++) {
			if(a[i] - a[i-1] > result) {
				result = a[i] - a[i-1];
			}
		}
		System.out.println(result);
	}
}