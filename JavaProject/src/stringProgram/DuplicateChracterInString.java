package stringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateChracterInString {

	public static void main(String[] args) {
		String str = "java2blog.com ";
		Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}

		}
		for (Entry<Character, Integer> data : charCountMap.entrySet()) {
			if (data.getValue() <= 2) {
				System.out.println(data.getKey() + "  " + data.getValue());
			}
		}
	}
}