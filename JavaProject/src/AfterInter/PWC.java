package AfterInter;

import java.util.Optional;

public class PWC {
	
	
	
	
	public static void print(String a)
	{
		a ="ABC";
		Optional<Character> ofNullable = Optional.ofNullable(a.charAt(7));
		if(ofNullable.isPresent())
		{
			System.out.println("Null");
		}
		else 
		{
			System.out.println("Not ");
		}
	}
public static void main(String[] args) {
	String sts = "Hello";
	print(sts);
	
	
}
}
