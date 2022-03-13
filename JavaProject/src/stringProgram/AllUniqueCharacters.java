package stringProgram;

public class AllUniqueCharacters {

	public boolean hasAllUniqueChars() {
		String word="Hello";
		for (int index = 0; index < word.length(); index++) {

			char c = word.charAt(index);
			if (word.indexOf(c) != word.lastIndexOf(c))
				return false;
		}

		return true;
	}
}