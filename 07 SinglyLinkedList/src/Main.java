import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(10);

		// append
		linkedList.append(12);
		linkedList.append(16);

		// prepend
		linkedList.prepend(20);
		linkedList.prepend(50);
		System.out.println("length: " + linkedList.getLength());
		System.out.println("list: " + Arrays.toString(linkedList.printList()));

		// insert
		linkedList.insert(3, 25);
		System.out.println("length: " + linkedList.getLength());
		System.out.println("list: " + Arrays.toString(linkedList.printList()));

//        //remove
		linkedList.remove(4);
		System.out.println("length: " + linkedList.getLength());
		System.out.println("list: " + Arrays.toString(linkedList.printList()));

//        //reverse
//		LinkedList linkedList2 = linkedList.reverse(linkedList);
//		System.out.println("reverse linkedList" + Arrays.toString(linkedList2.printList()));

		linkedList.reverse();
		System.out.println("list: " + Arrays.toString(linkedList.printList()));
	}
}
