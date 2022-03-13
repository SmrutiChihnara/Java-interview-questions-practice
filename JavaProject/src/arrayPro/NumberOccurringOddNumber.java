package arrayPro;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NumberOccurringOddNumber {

	public static int getOddTimesElement(int ar[]) {
		int i;
		int result = 0;
		for (i = 0; i < ar.length; i++) {
			result = result ^ ar[i];
		}
		return result;
	}

	public static void main(String[] args) {

		int array[] = new int[] { 20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20 };
		getOddTimesElement(array);
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int data : array) {
			if (map.containsKey(data)) {
				map.put(data, map.get(data) + 1);
			} else {
				map.put(data, 1);
			}
		}
		for (Entry<Integer, Integer> maps : map.entrySet()) {
			if (maps.getValue() % 2 == 1) {
				System.out.println(maps.getKey());
			}
		}
	}
}
