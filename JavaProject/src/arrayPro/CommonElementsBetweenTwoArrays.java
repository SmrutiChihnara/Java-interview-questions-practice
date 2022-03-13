package arrayPro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsBetweenTwoArrays {
	public static void main(String[] args) {
		int arr1[] = { 2, 3, 4, 3, 1 };
		int arr2[] = { 1, 3, 9, 8, 4 };
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();
		for (int arr : arr1) {
			set.add(arr);
		}
		for (int arr3 : arr2) {
			set1.add(arr3);
		}
		set.retainAll(set1);
		System.out.println(set);

	}
}
