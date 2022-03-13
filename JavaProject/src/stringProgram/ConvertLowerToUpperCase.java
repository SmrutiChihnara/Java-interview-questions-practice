package stringProgram;

import java.util.Arrays;

public class ConvertLowerToUpperCase {
	public static void main(String[] args) {
String sts = "Hello World";
		char arr[] = sts.toCharArray();
		for (int i = 0; i < sts.length(); i++) {
			int temp = sts.charAt(i);
			if (temp > 65 && temp < 90) {
				temp = temp + 32;
				char chr = (char) temp;
				arr[i] = chr;
			}
			
			else if (temp > 97 && temp < 123) {
				temp = temp - 32;
				char chr = (char) temp;
				arr[i] = chr;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
