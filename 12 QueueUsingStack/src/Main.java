
public class Main {

	public static void main(String[] args) {
		QueueUsingStack queue = new QueueUsingStack();

		queue.enqueue(10);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printQueue();
		System.out.println(queue.peek());

		System.out.println(queue.dequeue());
		queue.printQueue();
		System.out.println(queue.peek());

		System.out.println(queue.dequeue());
		queue.printQueue();
		System.out.println(queue.peek());
	}

}
