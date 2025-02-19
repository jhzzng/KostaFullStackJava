package ex4;

public class Q6 {
	public static void main(String[] args) {
		int a, b;
		for (a = 1; a <= 6; a++) {
			for (b = 1; b <= 6; b++) {
				if (a + b == 6) {
					System.out.println(String.format("(%d,%d)", a, b));
				}
			}
		}
	}
}
