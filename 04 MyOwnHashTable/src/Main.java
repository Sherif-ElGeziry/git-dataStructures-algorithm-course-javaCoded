
public class Main {

	public static void main(String[] args) {
		MyOwnHashTable hashTable = new MyOwnHashTable(50);
		hashTable.set("grapes", 1200);
		hashTable.set("apple", 1500);
//		System.out.println("value for key grapes: " + hashTable.get("grapes"));
//		System.out.println("value for key apple: " + hashTable.get("apple"));
//		System.out.println("list of keys: " + Arrays.toString(hashTable.keys()));
	}
}