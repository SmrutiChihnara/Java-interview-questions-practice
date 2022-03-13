package AfterInter;

class ParentTest {

	public void sum(ParentTest parent) {
		System.out.println("Parent");
	}

	void get() {
		System.out.println("Parentt get");
	}
}

class Child extends ParentTest {
	void sum(Child parent) {
		System.out.println("Child");
	}

	protected void get() {
		System.out.println("Child");
	}

	public void getChild() {

	}
}

public class OverRiding {

	public static void main(String[] args) {
		ParentTest parent = new ParentTest();
		Child child = new Child();
		parent.sum(parent);
		child.sum(parent);
		ParentTest parent2 = new Child();
		parent2.sum(child);
		parent2.get();

	}
}
