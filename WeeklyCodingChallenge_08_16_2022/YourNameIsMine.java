package weeklycodechallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class YourNameIsMine {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter # of test cases: ");
		int num = myScan.nextInt();
		List<String> names = new ArrayList<>();
		System.out.println("Enter name pairs with the husbands name listed first: ");
		for(int i = 0; i < num * 2; i++) {
			names.add(myScan.next());
		}
		myScan.close();
		for(int i = 0; i < names.size(); i += 2) {
			canTheyMarry(names.get(i), names.get(i+1));
		}
	}

	
	static void canTheyMarry(String a, String b) {
		int location = 0;
		char[] ar1 = a.toCharArray();
		char[] ar2 = b.toCharArray();
		
		for(int i = 0; i < ar1.length; i++) {
			
			for(int j = location; j < ar2.length; j++, location++) {
				if(ar1[i] == ar2[j]) {
					break;
				}
				if(j == ar2.length - 1) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}
