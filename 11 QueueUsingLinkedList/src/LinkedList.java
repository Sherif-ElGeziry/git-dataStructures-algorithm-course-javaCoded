import java.util.NoSuchElementException;

public class LinkedList {
	MyNode first;
	MyNode last;
	int length;

	public LinkedList() {
		first = null;
		last = null;
		length = 0;
	}

	public int peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.getValue();
	}

	public void enqueue(int value) {
		MyNode newNode = new MyNode(value);
		if (length == 0) {
			first = newNode;
		} else {
			last.setNext(newNode);
		}
		last = newNode;
		length++;
	}

	public void dequeue() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		first = first.getNext();
		length--;
		if (length == 0) {
			last = null;
		}
	}

	public void printQueue() {
		if (first == null) {
			return;
		}
		MyNode currentNode = first;
		System.out.print(currentNode.getValue());
		currentNode = currentNode.getNext();
		while (currentNode != null) {
			System.out.print(" --> " + currentNode.getValue());
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}
}
