import java.util.ArrayList;

public class PriorityQueue {
	private final ArrayList<MyNode> queueArray = new ArrayList<>();

	// Note the smaller number means higher priority
	public void enqueue(String value, int priority) {
		MyNode newNode = new MyNode(value, priority);
		boolean contain = false;

		for (int i = 0; i < queueArray.size(); i++) {
			if (queueArray.get(i).priority > newNode.priority) {
				queueArray.add(i, newNode);
				contain = true;
				break;
			}
		}

		if (!contain) { // contain == false
			queueArray.add(newNode);
		}
	}

	public String dequeue() {
		if (queueArray.isEmpty()) {
			return "Empty Array";
		}
		MyNode toRemove = queueArray.get(0);
		queueArray.remove(0);
		return toRemove.value;
	}

	public MyNode front() {
		if (!queueArray.isEmpty()) {
			return queueArray.get(0);
		}
		return null;
	}

	public MyNode rear() {
		if (!queueArray.isEmpty()) {
			return queueArray.get(queueArray.size() - 1);
		}
		return null;
	}

	public boolean isEmpty() {
		return queueArray.isEmpty();
	}

	public String[] printQueue() {
		String[] Array = new String[queueArray.size()];
		for (int i = 0; i < Array.length; i++) {
			Array[i] = queueArray.get(i).value;
		}
		return Array;
	}
}
