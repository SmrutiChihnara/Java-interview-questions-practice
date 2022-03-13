package com.in.code;

import java.util.Arrays;

public class Angram {

	public static boolean isAnagramUsingStringMethods(String word, String anagram) {
		if (word.length() != anagram.length())
			return false;

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = anagram.indexOf(c);
			// If index of any character is -1, then two strings are not anagrams
			// If index of character is not equal to -1, then remove the chacter from the
			// String
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else
				return false;
		}
		return anagram.isEmpty();
	}

	public static void main(String[] args) {
		String word = "java2blog";
		String anagram = "aj2vabgol";
		isAnagramUsingStringMethods(word, anagram);
		;

		char[] data1 = word.toCharArray();
		char[] data2 = anagram.toCharArray();
		Arrays.sort(data1);
		Arrays.sort(data2);
		boolean equals = Arrays.equals(data1, data2);
		System.out.println(equals);

	}
}
