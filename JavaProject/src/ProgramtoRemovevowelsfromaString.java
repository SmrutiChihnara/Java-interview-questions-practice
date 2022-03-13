// Java program to remove vowels from a String

import java.util.Arrays;
import java.util.List;

public class ProgramtoRemovevowelsfromaString {
	static String remVowel(String str) {

		Character vowels[] = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		List<Character> asList = Arrays.asList(vowels);
		StringBuffer buffer = new StringBuffer(str);
		for (int i =0;i<buffer.length();i++)
			if(asList.contains(buffer.charAt(i)))
			{
				buffer.replace(i, i+1, "");
				i--;
			}
		return str;
		}

	


	// Driver method to test the above function
	public static void main(String[] args) {
		String str = "Smrutia";

		System.out.println(remVowel(str));
	}
}
