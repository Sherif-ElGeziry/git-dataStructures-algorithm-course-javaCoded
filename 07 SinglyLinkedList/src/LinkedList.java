
public class LinkedList {
	private Node head;
	private Node tail;
	private int length;

	public LinkedList(int value) {
		head = new Node(value);
		tail = head;
		length = 1;
	}

	public void append(int value) {
		Node newNode = new Node(value);
		tail.next = newNode;
		tail = newNode;
		length++;
	}

	public void prepend(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
		length++;
	}

	public int getLength() {
		return length;
	}

	public int[] printList() {
		int[] myList = new int[length];
		Node current = this.head;
		int i = 0;
		while (current != null) {
			myList[i] = current.value;
			current = current.next;
			i++;
		}
		return myList;
	}

	public void insert(int index, int value) {
		if (index < 0 || index > length) {
			System.out.println("Error index out of bounds");
		} else if (index == 0) {
			prepend(value);
		} else if (index == length) {
			append(value);
		} else {
			Node current = head;
			for (int i = 0; i < index - 1; i++) {
				current = current.next;
			}
			Node newNode = new Node(value);
			newNode.next = current.next;
			current.next = newNode;
			length++;
		}
	}

	public void remove(int index) {
		if (index < 0 || index > length) {
			System.out.println("Error index out of bounds");
		} else if (index == 0) {
			head = this.head.next;
			length--;
		} else {
			Node current = head;
			int i;
			for (i = 0; i < index - 1; i++) {
				current = current.next;
			}
			current.next = current.next.next;
			length--;
			if (i == length - 1) {
				tail = current;
			}
		}
	}

	public /* LinkedList */ void reverse() {// LinkedList linkedList) {
//		LinkedList newList = new LinkedList(linkedList.head.value);
//		Node current = newList.head;
//		while (current.next != null) {
//			current = current.next;
//			Node newNode = new Node(current.value);
//			newNode.next = newList.head;
//			newList.head = newNode;
//			newList.length++;
//		}
//		return newList;

		Node first = head;
		tail = head;
		Node second = first.next;
		for (int i = 0; i < length - 1; i++) {
			Node temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		head.next = null;
		head = first;

	}
}