package myTest;

public class Test {
	public static void main(String[] args) {
		String sts = "abaaaa";
		int count = 0;
		int length = sts.length() - 1;
		for (int i = 0; i <= length / 2;) {
			if (sts.charAt(i) == 'a' && sts.charAt(length) == 'a') {
				length--;
				count++;
			} else if (sts.charAt(i) != 'a') {
				i++;

			} else if (sts.charAt(length) != 'a') {
				length--;
			}
		}
		System.out.println(count);
	}
}
