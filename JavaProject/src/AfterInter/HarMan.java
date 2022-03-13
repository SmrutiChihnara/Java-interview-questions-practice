package AfterInter;

public class HarMan {
	
	public void print()
	{
		Runnable runnable = ()->
		{
			System.out.println("Hello");
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
	
	
	public static void main(String[] args) {
		String sts = "ABCDFG", intial = "";
		intial = sts = sts.replaceAll("A", "Z");
		System.out.println(intial + "  " + sts);

	}
}
