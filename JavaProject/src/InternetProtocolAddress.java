
public class InternetProtocolAddress {
public static void main(String[] args) {
	String Input = "1.1.1.1";
	String finalInput="";
	for (int i =0;i<Input.length();i++)
	{
		if(Input.charAt(i)=='.')
		{
			finalInput+="[.]";
		}
		else finalInput+=Input.charAt(i);
	}
	System.out.println(finalInput);
}
}
