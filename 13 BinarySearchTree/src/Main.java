
public class Main {

	public static void main(String[] args) {
		MyBinarySearchTree tree = new MyBinarySearchTree();

		tree.insert(9);
		tree.insert(4);
		tree.insert(20);
		tree.insert(1);
		tree.insert(6);
		tree.insert(15);
		tree.insert(170);
		tree.printTree();

//		tree.printTree(tree.lookUp(20));

		tree.remove(20);
		tree.remove(4);
		tree.printTree();
		tree.insert(20);
		tree.insert(18);
		tree.insert(10);
		tree.printTree();
		tree.remove(170);
		tree.printTree();

	}

}
