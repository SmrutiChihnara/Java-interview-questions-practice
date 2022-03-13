import java.util.Arrays;
import java.util.Collections;

public class ChangeUpperCaseToLowerCaseAndLoweToUpper {
	public static void main(String[] args) {
		String sts = "ABC";
		char[] charArray = sts.toCharArray();
		StringBuffer buffer = new StringBuffer();
		Collections.
		int i = 0;
		{
			for (i = 0; i < sts.length(); i++) {
				int ch = sts.charAt(i);
				if (ch > 64 && ch < 91) {
					ch = ch + 32;
					System.out.print((char) ch);
				} else if (ch > 96 && ch < 123) {
					ch = ch - 32;
					System.out.print((char) ch);
				}
				if (ch == 32)
					System.out.print(" ");
			}
		}
	}
}
