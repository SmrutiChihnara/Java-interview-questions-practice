package Java8;


class ConTest
{
	public ConTest getCon()
	{
		return new ConTest();
	}
	
	public void getConMethod()
	{
		System.out.println("ConTest");
	}
}

interface Test2
{
	
	
}
public class MethodRef {
	public static void getStatic() {
		System.out.println("HelloWorld");
	}

	
	public void getInstance()
	{
		System.out.println("Instance");
	}
	public static void main(String[] args) {
		Runnable run = MethodRef::getStatic;
		Runnable runnable =new MethodRef()::getInstance;
		Runnable runnable2 = ConTest ::new;
	//	ConTest conTest=runnable.run();
		runnable.run();
		run.run();
	}
}
