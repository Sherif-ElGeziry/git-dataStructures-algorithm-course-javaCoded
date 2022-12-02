import java.util.Stack;

public class QueueUsingStack {
	Stack<Integer> stack = new Stack<>();
	Stack<Integer> auxiliaryStack = new Stack<>();

	public void enqueue(int value) {
		stack.push(value);
	}

	public int dequeue() {
		fillAuxWithStack();
		int value = auxiliaryStack.pop();
		fillStackWithAux();
		return value;
	}

	public int peek() {
		fillAuxWithStack();
		int value = auxiliaryStack.peek();
		fillStackWithAux();
		return value;
	}

	public void printQueue() {
		if (stack.empty())
			return;

		fillAuxWithStack();
		Object[] list = auxiliaryStack.toArray();

		for (Object obj : list) {
			System.out.print(obj + "\t");
		}
		System.out.println();

		fillStackWithAux();
	}

	private void fillAuxWithStack() {
		while (!stack.isEmpty()) {
			auxiliaryStack.push(stack.pop());
		}
	}

	private void fillStackWithAux() {
		while (!auxiliaryStack.isEmpty()) {
			stack.push(auxiliaryStack.pop());
		}
	}
}
