package Sorting;

public class MergeSort<T> implements Sorter<T> {

	@SuppressWarnings("unchecked")
	private void merge(T[] arr, int l, int m, int r) {

		int n1 = m - l + 1;
		int n2 = r - m;

		T[] L = (T[]) new Object[n1];
		T[] R = (T[]) new Object[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = (T) arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = (T) arr[m + 1 + j];
		}

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			Comparable<T> obj1 = (Comparable<T>) L[i];
			Comparable<T> obj2 = (Comparable<T>) R[j];
			if (obj1.compareTo((T) obj2) <= 0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;

		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public void sort(T[] arr, int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	@Override
	public void sort(T[] arr) {
		sort(arr, 0, arr.length - 1);
	}
}
