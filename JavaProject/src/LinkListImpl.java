
public class LinkListImpl {
	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public LinkListImpl insertNode(LinkListImpl list, int data) {
		Node new_Node = new Node(data);
		new_Node.next = null;
		if (list.head == null) {
			head = new_Node;
		}

		else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = new_Node;
		}
		return list;
	}

}
