public class Main {

	public static void main(String[] args) {
		MyOwnArray arr1 = new MyOwnArray();
		arr1.get(0);

		arr1.push("My");
		arr1.push("name");
		arr1.push("is");
		arr1.push("Sherif");
		arr1.insert(1, "Test");
		arr1.printArray();
		arr1.get(0);
		arr1.get(2);
		arr1.printArray();

		System.out.println();
		arr1.replace(-1, "first name");
		arr1.replace(1, "first name");
		arr1.printArray();

		arr1.pop();
		arr1.printArray();
		arr1.delete(1);
		arr1.printArray();

		System.out.println(arr1.length());
	}

}
