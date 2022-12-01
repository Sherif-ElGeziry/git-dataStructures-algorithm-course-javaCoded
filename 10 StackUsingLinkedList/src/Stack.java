
public class Stack {
	Node top;
	Node bot;
	int length;

	public Stack() {
		this.top = null;
		this.bot = null;
		length = 0;
	}

	public String peek() {
		if (length > 0)
			return top.value;
		else
			return null;
	}

	public void push(String value) {
		Node newNode = new Node(value);
		if (top == null) {
			top = newNode;
			bot = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
		length++;
	}

	public void pop() {
		if (length > 0) {
			top = top.next;
		}
		if (length == 1) {
			bot = null;
		}
		length--;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public String getLastElement() {
		if (length > 0) {
			return bot.value;
		}
		return null;
	}

}
