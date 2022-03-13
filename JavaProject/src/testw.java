// Java implementation of the above approach

public class testw {

// Function to find the minimum deletions
	static int check(String s) {

		int i, j;
		// Array to store the occurrences
		// of each characters
		int fr[] = new int[s.length()];

		// Length of the string
		int n = s.length();
		for (i = 0; i < n; i++) {

			// ASCII of the character
			char x = s.charAt(i);

			// Increasing the frequency for this character
			fr[x - 'a'] += 1;

		}

		int minimum = Integer.MAX_VALUE;

		for (i = 0; i < s.length(); i++) {
			for (j = i + 1; j <s.length(); j++) {

				// Choosing two character
				int z = fr[i] + fr[j];

				// Finding the minimum deletion
				minimum = Math.min(minimum, n - z);
			}
		}

		return minimum;
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {

		String s = "BAAABAB";
		System.out.println(check(s));

	}
	// This code is contributed by ANKITRAI1
}
