public class G {

	static int getSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}

	static int smallestNumber(int N) {

		int i = getSum(N);
		int d = i * 2;
		int k = N;
		String sts = "";
		while (k < 100000) {
			if (getSum(k) == d) {
break;
			}
			k++;
		}
		return k;

	}

	public static void main(String[] args) {
		int N = 99;
		 System.out.println(smallestNumber(19));
		//smallestNumber();
	}
}