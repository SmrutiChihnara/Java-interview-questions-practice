package Java8;

public class LambdaExpressions {
	
	public void run() {
		
	}
public static void main(String[] args) {
	Runnable run = ()->
	{
		System.out.println("Hello");
	};
	run.run();
}
}
