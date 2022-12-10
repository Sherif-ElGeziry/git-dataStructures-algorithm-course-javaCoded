import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		PriorityQueue queue = new PriorityQueue();

		System.out.println(queue.dequeue());

		queue.enqueue("piyush", 3);
		queue.enqueue("rohan", 1);
		queue.enqueue("jeet", 2);
		queue.enqueue("john", 5);
		queue.enqueue("Dave", 4);
		System.out.println(Arrays.toString(queue.printQueue()));

		System.out.println(queue.dequeue());
		System.out.println(Arrays.toString(queue.printQueue()));

		System.out.println(queue.front().value);
		System.out.println(queue.rear().value);
		System.out.println(queue.isEmpty());
	}

}
