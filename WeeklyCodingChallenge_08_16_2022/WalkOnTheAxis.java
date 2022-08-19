package weeklycodechallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WalkOnTheAxis {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Enter # of test cases: ");
		int num = myScan.nextInt();
		
		System.out.println("Enter test cases as integers separated by spaces: ");
		List<Integer> tests = new ArrayList<>();
		
		for(int i = 0; i < num; i++) {
			tests.add(myScan.nextInt());
		}
		
		myScan.close();
		
		for(int i = 0; i < tests.size(); i++) {
			distance(tests.get(i));
		}
	}

	
	static void distance(int c) {
		int result = 0;
		List<Integer> lights = new ArrayList<>();
		for(int i = 0; i <= c; i++) {
			lights.add(1);
		}
		boolean direction = true;
		while(lights.size() > 1) {
			if(direction) {
				result += Math.abs(lights.size());
				lights.remove(lights.size()-1);
				direction = false;
			}
			else {
				result += Math.abs(0 - (lights.size()));
				lights.remove(0);
				direction = true;
			}
		}
		
		
		System.out.println(result);
	}
}
