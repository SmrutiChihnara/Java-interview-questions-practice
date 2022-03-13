package AfterInter;

import java.util.Arrays;

public class KPIT {
	public static void main(String[] args) {
		String s1 = "abc";
		char arr[] = s1.toCharArray();
		String s2 = "asdcabc";
		Arrays.sort(arr);
		int indexNumber = s1.length();
		for (int i = 0; i < s2.length(); i++) {
			if (indexNumber < s2.length()) {
				char[] substring = s2.substring(indexNumber, indexNumber).toCharArray();
				Arrays.sort(substring);
				indexNumber=indexNumber+3;
				if (Arrays.equals(substring, arr)) {
                 System.out.println("Found");
				}
			}
		}

	}
}
