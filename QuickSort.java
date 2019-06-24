package Sorting;

public class QuickSort<T> implements Sorter<T>

{
	@Override
	public void sort(T[] arr) {
		quicksort(arr, 0, arr.length - 1);
	}

	@SuppressWarnings("unchecked")
	public int partition(T[] arr, int l, int r) {
		int i = l - 1;
		int j = l;
		Comparable<T> min = (Comparable<T>) arr[r];
		while (j < r) {
			if (min.compareTo(arr[j]) >= 0) {
				i++;
				T temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		T temp = (T) arr[r];
		arr[r] = arr[i + 1];
		arr[i + 1] = temp;

		return i + 1;
	}

	private void quicksort(T[] arr, int l, int r) {

		if (l < r) {
			int pivot = partition(arr, l, r);
			quicksort(arr, l, pivot - 1);
			quicksort(arr, pivot + 1, r);
		}
	}
}
