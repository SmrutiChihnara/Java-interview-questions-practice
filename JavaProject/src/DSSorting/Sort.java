package DSSorting;

import stringProgram.reverseAString;

public class Sort {
	public static void divide(int arr[], int si, int ei) {

		if (si >= ei) {
			return;
		}
		int mid = si + ei / 2;
		divide(arr, si, mid);
		divide(arr, mid, ei);
		conquer(arr, si, mid, ei);
	}

	private static void conquer(int[] arr, int si, int mid, int ei) {

		int merged[] = new int[ei - si + 1];
		int index1 = si;
		int index2 = mid;
		int x = 0;

		while (index1 < mid && index2 < ei) {
			if (arr[index1] <= arr[index2]) {
				merged[x++] = arr[index1++];
			} else {
				merged[x++] = arr[index2++];
			}
		}

		while (index1 <= mid) {
			merged[x++] = arr[index1++];
		}
		while (index2 <= ei) {
			merged[x++] = arr[index2++];
		}
		for(int i =0,j = si;i<merged.length;i++)

	}

	public static void main(String[] args) {

	}
}
