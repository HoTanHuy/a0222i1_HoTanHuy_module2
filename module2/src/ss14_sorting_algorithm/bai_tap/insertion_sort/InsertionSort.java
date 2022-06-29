package ss14_sorting_algorithm.bai_tap.insertion_sort;

import ss14_sorting_algorithm.bai_tap.sort_algorithm.SortAlgorithm;

public class InsertionSort extends SortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12,14,1,2,4,7,6,5};
        insertionSort(arr);
        display(arr);
    }
}
