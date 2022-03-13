package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {

		// Given input array
		Integer[] inputArray = { 3, 7, 9, 6, 4 };
		// Print array before reverse
		System.out.println("Array without reverse" + Arrays.toString(inputArray));
		// Calling method to swap elements
		reverseArray(inputArray);
	}

	public static void reverseArray(Integer[] arr) {
		// Converting Array to List
		List<Integer> list = Arrays.asList(arr);
		// Reversing the list using Collections.reverse() method
		Collections.reverse(list);
		// Printing the reverse Array
		System.out.print("Reverse Array :");
		for (Integer val : list)
			System.out.print(" " + val);
	}
}
