package stringProgram;

public class reverseAString {
	String sts = "HelloWorld";
	static String rev = "";

	public void useLoop() {
		for (int i = sts.length(); i > 0; i--) {
			rev = rev + sts.charAt(i);
		}
		System.out.println(rev);
	}
	
	public void byMethod()
	{
		StringBuilder builder = new StringBuilder(sts);
		builder.reverse();
	}
	public void byRecsive(String mainString)
	{
		if(mainString==null||mainString.length()<1)
		{
			System.out.println(mainString);
		}
		else
		{
			rev =rev+mainString.charAt(mainString.length()-1);
			byRecsive(mainString.substring(0,mainString.length()-1));
		}
	}
	public static void main(String[] args) {
		new reverseAString().byRecsive("Hello");
		System.out.println(rev);
	}
}
