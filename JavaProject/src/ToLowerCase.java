
public class ToLowerCase {
	public static void main(String[] args) {
		String sts = "HELLO";
		String adat;
		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < sts.length(); i++) {
			char ch = (sts.charAt(i) > 64 && sts.charAt(i) < 91 ? (char) (sts.charAt(i) + 32) : sts.charAt(i));
			buffer.append(ch);
		}

		System.out.println(buffer);

	}
}
