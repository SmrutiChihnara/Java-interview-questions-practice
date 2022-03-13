package arrayPro;

public class LongestCommonPrefixInAnArrayOfStrings {
	public static void main(String[] args) {
		String[] strArr = { "java2blogSmruti", "javaworldSmruti", "javabeanSmruti", "javatempSmruti" };
		String logestString = "";
		String temp = "";
		for (int i = 0; i < strArr[0].length(); i++) {
			for (int j = i + 1; j < strArr[0].length(); j++) {
				String subString = strArr[0].substring(i, j);
				int k = 0;
				for (String contens : strArr) {

					if (contens.contains(subString)) {
						k++;
						if (strArr.length == k) {
							if (logestString.length() < subString.length()) {
								logestString = subString;
							}
						}

					}

				}

			}
		}
		System.out.println(logestString);
	}
}
