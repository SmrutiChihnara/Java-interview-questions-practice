package stringProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramsInJava {

	public static boolean findAngramUsingMap(String s1, String s2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> map2 = new HashMap<Character, Integer>();
		if (s1.length() == s2.length()) {
			char arrS1[] = s1.toCharArray();
			char arrS2[] = s2.toCharArray();
			for (int i = 0; i < arrS1.length; i++) {
				if (map.containsKey(arrS1[i])) {
					map.put(arrS1[i], map.get(arrS1[i]) + 1);
				} else {
					map.put(arrS1[i], 1);
				}

				if (map2.containsKey(arrS2[i])) {
					map2.put(arrS2[i], map2.get(arrS2[i]) + 1);
				} else {
					map2.put(arrS2[i], 1);
				}
			}
		}
		return map.equals(map2);
	}

	public static void main(String[] args) {
		String word = "java2blog";
		String anagram = "aj2vabgul";
		boolean findAngramUsingMap = findAngramUsingMap(word, anagram);
		System.out.println(findAngramUsingMap);

		char[] data1 = word.toCharArray();
		char[] data2 = anagram.toCharArray();
		Arrays.sort(data1);
		Arrays.sort(data2);
		boolean equals = Arrays.equals(data1, data2);
		// System.out.println(equals);

	}
}
