
public class Main {

	public static void main(String[] args) {
		LinkedList queue = new LinkedList();

		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.printQueue();
		System.out.println(queue.peek());

		queue.dequeue();
		queue.printQueue();
		System.out.println(queue.peek());

		queue.dequeue();
		queue.printQueue();
		System.out.println(queue.peek());

		queue.dequeue();
		queue.printQueue();
		System.out.println(queue.peek());
	}

}
