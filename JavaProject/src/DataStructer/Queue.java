package DataStructer;

public class Queue {
	int font, rear, capacity = 0;
	int[] queueArr;

	public Queue(int size) {

		queueArr = new int[size];
		// TODO Auto-generated constructor stub
	}

	public void enqueue(int data) {
		if (capacity == queueArr.length-1) {
			System.out.println("full");
		} else {
			queueArr[rear] = data;
			rear++;
			capacity++;
		}
	}

	public void dequeue() {
		if (capacity == 0) {
			System.out.println();
		} else {
			for (int i = font; i < rear; i++) {
				queueArr[i] = queueArr[i + 1];
			}
			rear--;
			capacity--;
		}

	}

	public void print() {
		for (int i = font; i < rear; i++)
			System.out.println(queueArr[i]);
	}

	public static void main(String a[]) {
		Queue queue = new Queue(5);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(10);
		queue.enqueue(23);
		queue.print();
		System.out.println("--");
		queue.dequeue();
		queue.print();
		queue.enqueue(50);
		System.out.println("--");
		queue.print();

	}
}
