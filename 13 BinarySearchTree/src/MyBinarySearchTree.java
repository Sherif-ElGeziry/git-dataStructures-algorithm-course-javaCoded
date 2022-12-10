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

	int count = 0;

	public void printTree() {
		count = 0;
		printTree(root);
	}

	public void printTree(MyBinaryNode myNode) {
		System.out.print(myNode.getValue());
		System.out.println();
		count++;

		if (myNode.getLeft() != null) {
			System.out.print("\t".repeat(Math.max(0, count)) + "Left: ");
			printTree(myNode.getLeft());
		}

		if (myNode.getRight() != null) {
			System.out.print("\t".repeat(Math.max(0, count)) + "Right: ");
			printTree(myNode.getRight());
		}

		count--;
	}

	public MyBinaryNode lookUp(int value) {
		if (root == null) {
			return null;
		}

		MyBinaryNode currentNode = root;
		while (currentNode != null) {
			if (currentNode.getValue() > value) {
				currentNode = currentNode.getLeft();
			} else if (currentNode.getValue() < value) {
				currentNode = currentNode.getRight();
			} else {
				return currentNode;
			}
		}

		return null;
	}

	public void remove(int value) {
		if (root == null) {
			return;
		}

		MyBinaryNode nodeToRemove = root;
		MyBinaryNode parentNode = null;
		while (nodeToRemove.getValue() != value) {
			parentNode = nodeToRemove;
			if (value < nodeToRemove.getValue()) {
				nodeToRemove = nodeToRemove.getLeft();
			} else if (value > nodeToRemove.getValue()) {
				nodeToRemove = nodeToRemove.getRight();
			}
		}

		MyBinaryNode replacementNode = null;
		if (nodeToRemove.getRight() != null) { // we have a right node
			replacementNode = nodeToRemove.getRight();

			if (replacementNode.getLeft() == null) { // we don't have a left node
				replacementNode.setLeft(nodeToRemove.getLeft());
			} else { // we have a left node, let's find the leftmost
				MyBinaryNode replacementParentNode = nodeToRemove;
				while (replacementNode.getLeft() != null) {
					replacementParentNode = replacementNode;
					replacementNode = replacementNode.getLeft();
				}
				replacementParentNode.setLeft(null);
				replacementNode.setLeft(nodeToRemove.getLeft());
				replacementNode.setRight(nodeToRemove.getRight());
			}
		} else if (nodeToRemove.getLeft() != null) { // we only have a left node
			replacementNode = nodeToRemove.getLeft();
		}

		if (parentNode == null) {
			root = replacementNode;
		} else if (parentNode.getLeft() == nodeToRemove) {
			parentNode.setLeft(replacementNode);
		} else {
			parentNode.setRight(replacementNode);
		}
	}
}
