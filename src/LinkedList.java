import java.awt.List;

public class LinkedList<E> extends List {

	public static class Node<E> {

		Object data;
		Node<E> next;

		public Node(Object item) {
			this.data = item;
			this.next = null;
		}
	}

	static Node head = null;
	static Node tail = null;
	static Node prev = null;
	static int nodeSize = 0;

	public static void addFirst(Object item) {
		Node newNode = new Node(item);

		if (head == null) {
			head = newNode;
			tail = head;
			nodeSize++;
		} else {
			newNode.next = head;
			head = newNode;
			nodeSize++;
		}

	}

	public void addLast(Object item) {
		Node newNode = new Node<E>(item);

		if (head == null) {
			head = newNode;
			tail = newNode;
			nodeSize++;
		} else {
			if (head == tail) {
				head.next = newNode;
				prev = head;
				tail = head.next;
				nodeSize++;
			} else {
				tail.next = newNode;
				prev = tail;
				tail = tail.next;
				nodeSize++;
			}
		}
	}

	public void removeFirst() {
		if (head == null) {
			throw new NullPointerException("Node does not exist");
		}

		if (head.next == null) {
			head = null;
			tail = null;
			nodeSize--;
		} else {
			head = head.next;
			nodeSize--;
		}
	}

	public void removeLast() {
		if (head == null || head == tail) {
			removeFirst();
		} else {
			tail = prev;
			nodeSize--;
		}

	}

	public Object peekFirst() {
		if (head == null) {
			throw new NullPointerException("Node does not exist");
		}

		return head.data;
	}

	public Object peekLast() {
		if (nodeSize <= 1) {
			peekFirst();
		}

		return tail.data;
	}

	public int getListSize() {
		return nodeSize;
	}

	public void printList() {
		Node temp = head;

		if (temp == null) {
			System.out.println("Empty List");
		}
		if (temp.next == null) {
			System.out.println(temp.data);
		}

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;

		}
		System.out.println();
	}

}
