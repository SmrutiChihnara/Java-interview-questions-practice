package stringProgram;

import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterMain {

	public static void printFristDuplicateChracterUsingJava8() {
		String sts = "rrrellom";
		List<char[]> asList = Arrays.asList(sts.toCharArray());
		//List<String> asList = Arrays.asList(sts);
	
		  char[] key = asList.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream().filter(data->data.getValue()==1).findFirst().get().getKey();
		  System.out.println(key[0]);
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//Character key = map.entrySet().stream().filter(data -> data.getValue() == 1).findFirst().get().getKey();
		System.out.println(key);

	}

	public static void main(String[] args) {
		System.out
				.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
		System.out
				.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
	}

	public static Character getNonRepeatedCharacter(String str) {
		printFristDuplicateChracterUsingJava8();
		Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character c = str.charAt(i);
			if (!countCharacters.containsKey(c)) {
				countCharacters.put(c, 1);
			} else {
				countCharacters.put(c, countCharacters.get(c) + 1);
			}
		}
		// As LinkedHashMap maintains insertion order, first character with
		// count 1 should return first non repeated character
		for (Entry<Character, Integer> e : countCharacters.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;

	}
}