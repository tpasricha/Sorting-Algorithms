package Sorting;

public class InsertionSort<T> implements Sorter<T> {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override

	public void sort(T[] arr) {
		for (int i = 1; i < arr.length; i++) {
			T temp = arr[i];
			int j = i - 1;
			while (j >= 0 && ((Comparable) temp).compareTo(arr[j]) < 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
	}
}
