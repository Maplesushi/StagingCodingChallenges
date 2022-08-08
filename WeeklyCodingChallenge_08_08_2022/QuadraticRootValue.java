package weeklycodechallenge;

public class QuadraticRootValue {

	public static void main(String[] args) {
		System.out.println(getRoot(1,2,-3));
		System.out.println(getRoot(2,-7,3));
		System.out.println(getRoot(1,-12,-28));
	}

	static int getRoot(int a, int b, int c) {
		return (int) (((-1 * b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c)))/(2 * a));
	}
}
