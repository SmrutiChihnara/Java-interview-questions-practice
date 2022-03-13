package collectiontest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getKey());
		}
		List<String> list = new ArrayList<String>();

		String sts = "HelloWorld";
		Set<Character> characters = new HashSet<Character>();
		char[] arr = sts.toCharArray();
		for (char c : arr) {
			if (!characters.add(c)) {
				System.out.println(c);
			}
		}
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("Hello1");
		List<String> lists = new ArrayList<String>(set);
		set = new HashSet<String>(lists);
		String[] string = new String[set.size()];
		String[] array = set.toArray(string);
		for (String string2 : array) {
			System.out.println(string2);
		}

		String sts2[] = { "a", "B", "a" };
		Set<String> set2 = new HashSet<String>(Arrays.asList(sts2));
		System.out.println(set2);
		
		int st[] = { 1,34,5};
		Set<Integer> se = new HashSet<Integer>(Arrays.asList(st));
		System.out.println(set2);
		
		

	}
}
