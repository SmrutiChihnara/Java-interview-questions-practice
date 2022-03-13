import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PalidramInOneInt {
	public static void main(String[] args) {
		String sts = "aannlogy";
		HashMap<Character, Integer> hashMap = new LinkedHashMap();
		char ch[] = sts.toCharArray();
		for (char arr : ch) {
			if (hashMap.containsKey(arr)) {
				hashMap.put(arr, hashMap.get(arr) + 1);
			} else {
				hashMap.put(arr, 1);
			}
		}
		System.out.println(hashMap);
		Set<Entry<Character, Integer>> set = hashMap.entrySet();
		Iterator<Entry<Character, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			if(itr.next().getValue()==1)
			{
				System.out.println(itr.next().getKey());
				break;
			}
		}

	}
}
