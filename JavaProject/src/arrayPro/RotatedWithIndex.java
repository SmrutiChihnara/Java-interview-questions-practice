package arrayPro;

import java.util.Arrays;

public class RotatedWithIndex {
	int Arr[] = { 1, 2, 3, 4, 5, 6 }, k = 1;

	public static void main(String[] args) {
		new RotatedWithIndex().rotated();
		rotateExtraSpace();
	}

	public static int[] rotateExtraSpace() {
		int Arr[] = { 1, 2, 3, 4, 5, 6 }, k = 1;
		int n = Arr.length;
		if (k > n)
			k = k % n;

		int[] result = new int[n];

		for (int i = 0; i < k; i++) {
			result[i] = Arr[n - k + i];
		}

		int index = 0;
		for (int i = k; i < n; i++) {
			result[i] = Arr[index++];
		}
		return result;
	}

	public void rotated() {
		int length = Arr.length - 1;
		for (int i = 0; i < k; i++) {
			int temp = Arr[length];
			Arr[length] = Arr[i];
			Arr[i] = temp;
			length--;

		}
		System.out.println(Arrays.toString(Arr));
	}
}
