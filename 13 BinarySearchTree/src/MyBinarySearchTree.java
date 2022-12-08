
public class MyBinarySearchTree {

	private MyBinaryNode root;

	public MyBinarySearchTree() {
		this.root = null;
	}

	public void insert(int value) {
		if (root == null) {
			root = new MyBinaryNode(value);
			return;
		}
		MyBinaryNode currentNode = root;

		while (true) {
			if (currentNode.getValue() > value) {
				if (currentNode.getLeft() == null) {
					currentNode.setLeft(new MyBinaryNode(value));
					return;
				}
				currentNode = currentNode.getLeft();
			} else {
				if (currentNode.getRight() == null) {
					currentNode.setRight(new MyBinaryNode(value));
					return;
				}
				currentNode = currentNode.getRight();
			}
		}
	}
}
