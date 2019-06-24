package Sorting;

public class SelectionSort<T> implements Sorter<T> {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			Comparable<T> min = (Comparable<T>) arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (min.compareTo(arr[j]) > 0) {
					min = (Comparable<T>) arr[j];
					index = j;
				}
			}
			T temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}
}
