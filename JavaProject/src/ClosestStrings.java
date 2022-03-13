import java.util.HashMap;
import java.util.LinkedHashMap;

public class ClosestStrings {
	public static void main(String[] args) {
		String b = "geeks";
		String a = "practice";
		String S[] = { "geeks", "for", "geeks", "contribute", "practice" };
		HashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put(b, a);
		map.get(map)
		int count = 0;
		for (String sts : S) {
			if (b.equalsIgnoreCase(sts))
				count = 0;
			if (sts.equalsIgnoreCase(a)) {
				count++;
			}

		}
		System.out.println(count);
	}
}
