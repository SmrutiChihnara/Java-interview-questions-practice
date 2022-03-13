package DataStructer;

public class Stack {
	int element;
	int capacity;
	int top = 0;
	int stackArr[];

	public Stack(int size) {
		this.capacity = size;
		stackArr = new int[capacity];
	}

	public void push(int data) {
		if (top == stackArr.length) {
			return;
		} else {
			stackArr[top] = data;
			top++;
		}
	}

	public void pop() {
		if (top == 0) {
			System.out.println("Stack empty");
		} else {
			top--;
		}
	}

	public void print() {
		for (int i = 0; i < top; i++)
			System.out.println(stackArr[i]);
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(30);
	
		stack.push(10);
		stack.push(90);
		stack.print();
		stack.pop();
		System.out.println("---------");
		stack.print();
	}

}
