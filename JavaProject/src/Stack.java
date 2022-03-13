import java.util.Arrays;

public class Stack {

	int top = -1;
	int arr[];
	int size;
	int capacity;

	public Stack(int capacity) {
		arr = new int[capacity];
		this.capacity = capacity;
	}

	public void push(int data) {
		if (capacity == size) {
			System.out.println("Stack full");
		} else {
			arr[++top] = data;
			size++;
		}
	}

	public int remove() {
		if (arr.length == 0) {
			System.out.println("Stack is empty");
		}
		return arr[top--];
	}

	public int[] print() {
		for(int i=0;i<=top;i++)
		{
			System.out.println(arr[i]);
		}
		return arr;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(4);
		stack.push(10);
		stack.push(20);
		stack.push(5);
		//System.out.println(stack.print());
		String string = Arrays.toString(stack.print());
		System.out.println(string);

	}
}
