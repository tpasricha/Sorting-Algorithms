package Sorting;

public class HeapSort<T> implements Sorter<T> {

	@Override
	public void sort(T[] arr) {
		int n = arr.length;
		buildHeap(arr);
		for (int i = n - 1; i > 0; i--) {
			T temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}

	}

	private void buildHeap(T[] arr) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
	}

	@SuppressWarnings("unchecked")
	private void heapify(T[] arr, int n, int i) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		Comparable<T> largest = (Comparable<T>) arr[i];
		int largeIndex = i;

		if (left < n && largest.compareTo(arr[left]) < 0) {
			largest = (Comparable<T>) arr[left];
			largeIndex = left;
		}

		if (right < n && largest.compareTo(arr[right]) < 0) {
			largest = (Comparable<T>) arr[right];
			largeIndex = right;
		}

		if (largeIndex != i) {
			T temp = arr[i];
			arr[i] = arr[largeIndex];
			arr[largeIndex] = temp;
			heapify(arr, n, largeIndex);
		}
	}
}
