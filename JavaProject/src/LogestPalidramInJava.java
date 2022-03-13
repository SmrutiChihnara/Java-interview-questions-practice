import java.util.HashMap;
import java.util.LinkedHashMap;

public class LogestPalidramInJava {

	public static void getPrint() {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		String sts = "Ranja";
		String logestString = "";
		int maxLength = 0;
		for (int i = 0; i < sts.length(); i++) {
			for (int j = i; j < sts.length(); j++) {
				String subString = sts.substring(i, j);
				StringBuilder builder = new StringBuilder(subString);
				if (sts.contains(builder.reverse())) {
					if (maxLength < subString.length()) {
						maxLength = subString.length();
						logestString = subString;
					}
				}
			}
		}
		System.out.println(logestString);
		System.out.println(maxLength);
	}

	public static void main(String[] args) {
		getPrint();
	}
}
