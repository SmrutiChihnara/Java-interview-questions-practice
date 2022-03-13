package AfterInter;

class Parent {
	void sum() {

	}

}

public class UST extends Parent {
	void sum() {

	}

	public static void main(String[] args) {
		Parent parent = new UST();
		parent.sum();

	}
}
