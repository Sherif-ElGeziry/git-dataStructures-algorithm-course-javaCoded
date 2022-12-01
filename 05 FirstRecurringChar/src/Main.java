
public class Main {

	public static void main(String[] args) {
		FirstRecurring obj = new FirstRecurring();

		int[] arr1 = { 2, 5, 5, 2, 3, 5, 1, 2, 4 };
		System.out.println(obj.firstRecurringCharacter(arr1));

		int[] arr2 = { 2, 1, 1, 2, 3, 5, 1, 2, 4 };
		System.out.println(obj.firstRecurringCharacter(arr2));

		int[] arr3 = { 2, 3, 4, 5 };
		System.out.println(obj.firstRecurringCharacter(arr3));
	}

}
