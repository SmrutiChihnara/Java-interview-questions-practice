package DataStructer;

public class SinglyLinked {
	Node head;;
	static SinglyLinked list;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;

		}

	}

	public void put(int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (list.head == null) {
			list.head = newNode;
		} else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
	}

	public void print() {
		Node current = list.head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;

		}
	}

	public static SinglyLinked deleteByKey(int key) {
		Node currNode = list.head, prev = null;

		if (currNode != null && currNode.data == key) {
			list.head = currNode.next; // Changed head

			System.out.println(key + " found and deleted");

			return list;
		}

		while (currNode != null && currNode.data != key) {
			prev = currNode;
			currNode = currNode.next;
		}

		if (currNode != null) {
			prev.next = currNode.next;

			System.out.println(key + " found and deleted");
		}
		if (currNode == null) {
			System.out.println(key + " not found");
		}

		return list;
	}

	public static void main(String[] args) {
		list = new SinglyLinked();
		list.put(20);
		list.put(30);
		list.put(10);
		list.print();
		list.print();
		list.print();
		list.print();

	}
}
