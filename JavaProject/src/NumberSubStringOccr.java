import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberSubStringOccr {
	public static void main(String[] args) {
		String sts = "ABC";
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < sts.length(); i++) {
			for (int j = i+1; j <= sts.length(); j++) {
				System.out.println(sts.substring(i,j));
				/*
				 * if (map.containsKey(sts.substring(i, j))) map.put(sts.substring(i, j),
				 * map.get(sts.substring(i, j)) + 1); else map.put(sts.substring(i, j), 1);
				 */

			}
		}
		System.out.println(sts.substring(0,0));
		System.out.println(sts.substring(0,1));
	//	System.out.println(map);
	}
}
