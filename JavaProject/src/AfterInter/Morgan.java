package AfterInter;

class Parent1 {
	public void add(Integer number) {
		System.out.println("Number");
	}
}

class Child1 extends Parent1 {
	public void add(Number integer) {
		System.out.println("Integer");
	}

}

public class Morgan {
	public static void main(String[] args) {
		Parent1 parent = new Parent1();
		Parent1  parent2 = new Child1();
		parent2.add(10);

	}
}
