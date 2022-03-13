public class RevrseAStringUsingRecuction {
	static StringBuilder builder = new StringBuilder();
	public static void main(String[] args) {
		String str = "happy";
		RevrseAStringUsingRecuction rs = new RevrseAStringUsingRecuction();
		String reverseString = rs.reverseString(str);
		System.out.println(reverseString);
	}



	private String reverseString(String str) {
		if (str == null || str.length() < 1) {
			System.out.println(str);
			return str;
		} else {
			builder.append(str.charAt(str.length() - 1));
			reverseString(str.substring(0, str.length() - 1));
			return builder.toString();
		}
		//System.out.println(builder);
	}
	
}