package Sorting;

public class BubbleSort<T> implements Sorter<T> {

	@SuppressWarnings("unchecked")
	@Override
	public void sort(T[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				Comparable<T> obj1 = (Comparable<T>) arr[j];
				Comparable<T> obj2 = (Comparable<T>) arr[j + 1];
				if (obj1.compareTo((T) obj2) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
