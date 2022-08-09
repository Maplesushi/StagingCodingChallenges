import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		System.out.println(isItPerfect(myScan.nextInt()));
		myScan.close();
	}

	static boolean isItPerfect(int a) {
		List<Integer> factors = new ArrayList<>();
		for(int i = 1; i < a; i++) {
			if(a % i == 0) {
				factors.add(i);
			}
		}
		int sum = 0;
		for(int i = 0; i < factors.size(); i++) {
			sum += factors.get(i);
		}
		if(sum == a) {
			return true;
		}
		return false;
	}
}
