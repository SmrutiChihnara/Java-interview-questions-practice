package com.in.code;

public class LongestCommonSubstringMain {
	static String str1 = "Java2blog";
	static String str2 = "CoreJavaTutorial";

	public static void main(String[] args) {

		LongestCommonSubstringMain lcsMain = new LongestCommonSubstringMain();
		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);
		System.out.println("Longest common subString is: " + lcsMain.getLongestCommonSubstring(str1, str2));
getData();
	}

	public static void getData() {
		int maxLength;
		if (str1.length() < str2.length()) {
			maxLength = str1.length();
		} else {
			maxLength = str2.length();
		}
		String max = "";
		for (int i = 0; i < maxLength-1; i++) {
			for (int j = i; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					for (int m = i; m < str2.length(); m++) {
						for (int k = j; k < str2.length(); k++) {
							if (str1.charAt(m) == str2.charAt(k))
							max = max + str2.charAt(k);
						}
					}

				}
			}
		}
	}

	public String getLongestCommonSubstring(String str1, String str2) {
		
		int m = str1.length();
		int n = str2.length();

		int max = 0;

		int[][] dp = new int[m][n];
		int endIndex = -1;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (str1.charAt(i) == str2.charAt(j)) {

					// If first row or column
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						// Add 1 to the diagonal value
						dp[i][j] = dp[i - 1][j - 1] + 1;
					}

					if (max < dp[i][j]) {
						max = dp[i][j];
						endIndex = i;
					}
				}

			}
		}
		// We want String upto endIndex, we are using endIndex+1 in substring.
		return str1.substring(endIndex - max + 1, endIndex + 1);
	}
}