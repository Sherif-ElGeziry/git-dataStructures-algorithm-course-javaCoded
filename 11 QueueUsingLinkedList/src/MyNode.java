
public class MyNode {
	int value;
	MyNode next;

	public MyNode(int value) {
		this.value = value;
		this.next = null;
	}

	public MyNode(int value, MyNode next) {
		this.value = value;
		this.next = next;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setNext(MyNode next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}

	public MyNode getNext() {
		return next;
	}

}
