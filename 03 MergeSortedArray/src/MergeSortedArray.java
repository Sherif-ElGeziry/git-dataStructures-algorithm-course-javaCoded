
public class MergeSortedArray {
	public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
		final int[] mergedArray = new int[arr1.length + arr2.length];

		int j = 0, k = 0;
		for (int i = 0; i < mergedArray.length; i++) {
			if (j != arr1.length && (k == arr2.length || arr1[j] < arr2[k])) {
				mergedArray[i] = arr1[j];
				j++;
			} else {
				mergedArray[i] = arr2[k];
				k++;
			}
		}
		return mergedArray;
	}
}