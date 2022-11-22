//Implementation of our own Dynamic Array Data Structure

public class MyOwnArray {
	private String[] array; // we will store our elements in the array
	private int capacity; // capacity is the number of elements that our array can hold
	private int currentLength; // currentLength is the number of elements currently present in the array

	public MyOwnArray() {
		array = new String[1];
		capacity = 1;
		currentLength = 0;
	}

	// get(index) method returns the element of array at the given index
	public void get(int index) {
		if (index > -1 && index < currentLength) {
			System.out.println("[" + array[index] + "]");
		} else
			System.out.println("Index out of bound");
	}

	// push() method adds an element at the end
	public void push(String text) {
		// if currentLength becomes equal to capacity we need to increase the capacity
		// to add more elements
		if (capacity == currentLength) {
			String[] temp = new String[2 * capacity]; // create a new Array with double capacity

			for (int i = 0; i < array.length; i++)
				temp[i] = array[i]; // copy elements of old array to new array

			array = temp; // set the newly created array as our real array
			capacity *= 2; // update the value of capacity
		}

		array[currentLength] = text; // insert the new element at the end
		currentLength++; // Increase value of currentLength by 1
	}

	public void insert(int index, String text) {
		// capacity = 8;
		currentLength++;
		String[] temp = new String[currentLength];

//		for (int i = currentLength; i > index; i--) {
//			temp[i] = array[i - 1];
//		}
//		temp[index] = text;
//		array = temp;

		for (int i = 0; i < currentLength; i++) {
			if (i < index)
				temp[i] = array[i];
			else if (i == index)
				temp[i] = text;
			else
				temp[i] = array[i - 1];
		}
		array = temp;
	}

	// replace(index,value) replaces value at given index with the newly entered
	// value
	public void replace(int index, String text) {
		if (index > -1 && index < currentLength) {
			array[index] = text;
		} else
			System.out.println("Index out of bound no change will occur");
	}

	public void pop() {
		if (currentLength > 0)
			currentLength--;
	}

	public void delete(int index) {
		if (index > 0 && index < currentLength) {
			if (index == currentLength - 1)
				pop();
			else
				for (int i = index; i < currentLength; i++)
					array[i] = array[i + 1];
			currentLength--;
		} else
			System.out.println("Index out of bound no change will occur");
	}

	public int length() {
		return currentLength;
	}

	public void printArray() {
		System.out.print("\n[");
		for (int i = 0; i < currentLength; i++) {
			if (i == currentLength - 1)
				System.out.print(array[i] + "]\n");
			else
				System.out.print(array[i] + ", ");
		}
	}
}
