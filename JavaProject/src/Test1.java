
public class Test1 {
	public static void main(String[] args) {
		int a = 3464;
		int lastNumber=0;
		while (a >= 10) {
			a =a/10;
			lastNumber = a;

		}
		System.out.println(lastNumber);
		int fristNuber =a%10;
		System.out.println(fristNuber);
		System.out.println(fristNuber+lastNumber);
	}
}
