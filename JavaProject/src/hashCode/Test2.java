package hashCode;

public class Test2 {
public static void main(String[] args) {
	String sts = " world ";
	System.out.println(sts.hashCode());
	sts+=" hello ";
	System.out.println(sts.hashCode());
	sts.trim();
	
}
}
