package arrayPro;

public class FindDuplicateChracterInArr {
public static void main(String[] args) {
	String sts = "HelloWorld";
	for(char arr :sts.toCharArray())
	{
		if(sts.indexOf(arr)==sts.lastIndexOf(arr))
		{
			System.out.println(arr);
		}
	}
}
}
