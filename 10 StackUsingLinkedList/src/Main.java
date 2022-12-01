
public class Main {

	public static void main(String[] args) {
		Stack st1 = new Stack();

		st1.push("Google");
		st1.push("Udemy");
		st1.push("Discord");
		System.out.println(st1.peek());

		st1.pop();
		System.out.println(st1.peek());

		System.out.println(st1.isEmpty());
		System.out.println(st1.getLastElement());

	}

}
