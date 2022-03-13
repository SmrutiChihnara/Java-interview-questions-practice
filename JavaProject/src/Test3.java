class Super {
	public void getPrint(String s) {
		System.out.println("super");
	}
}

public class Test3 extends Super {
	public void getPrint(int s) {
		System.out.println("child");
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.getPrint(null);
	}

}
