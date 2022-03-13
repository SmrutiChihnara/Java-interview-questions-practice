package stringProgram;

import java.util.Iterator;

public class AllSubstringsOfStringInJava {
public static void main(String[] args) {
	String sts ="HelloWorld";
	for(int i =0;i<sts.length();i++)
	{
		for(int j = i+1;j<sts.length();j++)
		{
			System.out.println(sts.substring(i,j));
		}
	}
}
}
