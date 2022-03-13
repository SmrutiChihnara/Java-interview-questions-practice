package parten;

public class PartenTest {
	public static void print1() {
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		print1();
	}
}
