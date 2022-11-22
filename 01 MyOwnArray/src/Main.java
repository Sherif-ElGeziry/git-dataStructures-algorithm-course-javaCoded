
public class Main {

	public static void main(String[] args) {
		MyOwnArray arr1 = new MyOwnArray();
		System.out.println(arr1.get(0));

		arr1.push("My");
		arr1.push("name");
		arr1.push("is");
		arr1.push("Sherif");
		// arr1.insert(1, "Test");
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
//		System.out.println(arr1.get(4));

		System.out.println();
		arr1.replace(-1, "first name");
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
	}

}
