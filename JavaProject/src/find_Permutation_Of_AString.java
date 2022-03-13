
// Java program to print all permutations of a
// given string.
public class find_Permutation_Of_AString {
	public static void main(String[] args) {
		String myString = "ABC";
		int length = myString.length();
		find_Permutation_Of_AString permutation = new find_Permutation_Of_AString();
		permutation.permute(myString, 0, length - 1);
	}

	private void permute(String str, int zeroIndex, int lengthOfString) {
		if (zeroIndex == lengthOfString)
			System.out.println(str);
		else {
			for (int i = zeroIndex; i <= lengthOfString; i++) {
				str = swap(str, zeroIndex, i);
				permute(str, zeroIndex + 1, lengthOfString);
				str = swap(str, zeroIndex, i);
			}
		}
	}

	public String swap(String a, int i, int j) {
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}

}
