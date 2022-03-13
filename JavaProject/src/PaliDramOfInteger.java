
public class PaliDramOfInteger {
	public static void main(String[] args) {
		int a = 121;
		int sum = 0,r;
		int temp = a;

		while (a > 0) {
			r = a % 10;
			sum = (sum * 10) + r;
			a=a/10;
			
		}

		System.out.println(1 / 10);
		System.out.println(1 % 10);
	}
}
