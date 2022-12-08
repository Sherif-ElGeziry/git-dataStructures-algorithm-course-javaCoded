
public class MyBinaryNode {

	private int value;
	private MyBinaryNode left;
	private MyBinaryNode right;

	public MyBinaryNode(int value) {
		this.value = value;
	}

	public MyBinaryNode(int value, MyBinaryNode left, MyBinaryNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public void setLeft(MyBinaryNode left) {
		this.left = left;
	}

	public void setRight(MyBinaryNode right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public MyBinaryNode getLeft() {
		return left;
	}

	public MyBinaryNode getRight() {
		return right;
	}

}
