package Sorting;

public class SortingTest {

	public static void main(String[] args) {

		Sorter<Integer> sorterBubble = new BubbleSort<>();
		Sorter<Integer> sorterSelection = new SelectionSort<>();
		Sorter<Integer> sorterInsertion = new InsertionSort<>();
		Sorter<Integer> sorterMerge = new MergeSort<>();
		Sorter<Integer> sorterHeap = new HeapSort<>();
		Sorter<Integer> sorterQuick = new QuickSort<>();
		Integer[] nums = { 5, 10, 1, 9, 23, 45, 0, 35 };

		sorterBubble.sort(nums);
		sorterSelection.sort(nums);
		sorterInsertion.sort(nums);
		sorterMerge.sort(nums);
		sorterHeap.sort(nums);
		sorterQuick.sort(nums);

		for (int i : nums) {
			System.out.println(i);
		}

		Sorter<String> sorterString = new BubbleSort<>();
		Sorter<String> selectionString = new SelectionSort<>();
		Sorter<String> insertionString = new SelectionSort<>();
		Sorter<String> mergeString = new MergeSort<>();
		Sorter<String> heapString = new HeapSort<>();
		Sorter<String> quickString = new QuickSort<>();

		String[] names = { "devi", "thushith", "ashok", "murali" };

		sorterString.sort(names);
		selectionString.sort(names);
		insertionString.sort(names);
		mergeString.sort(names);
		heapString.sort(names);
		quickString.sort(names);

		for (String str : names) {
			System.out.println(str);
		}

	}
}
