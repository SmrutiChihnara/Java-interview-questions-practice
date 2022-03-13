package stringProgram;

public class RemoveALlSpaceInOneString {
public static void main(String[] args) {
	String sts = "Hello World Hello";
	sts= sts.replaceAll(" ", "");
	System.out.println(sts);
}
}
