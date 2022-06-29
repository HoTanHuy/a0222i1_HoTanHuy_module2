package ss14_sorting_algorithm.bai_tap.sort_algorithm;

public class SortAlgorithm  {
    public static void main(String[] args) {
        int[] arr = {15,18,13,12,14,16,9,10};
        //selectionSort(arr);
        //insertionSort(arr);
        bubbleSort(arr);
        display(arr);
    }
    private static void selectionSort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            int min_pos = i;
            for (int j = i; j < length; j++) {
                if (arr[min_pos]>arr[j]){
                    min_pos = j;
                }
            }
            if (min_pos!=i){
                int temp =arr[min_pos];
                arr[min_pos]= arr[i];
                arr[i] = temp;
            }

            System.out.printf("Loop %d: ", i + 1);
            display(arr);
            System.out.println();
        }
    }
    private static void bubbleSort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length ; i++) {
            boolean isSorted = true;
            for (int j = 0; j < length-i-1 ; j++) {
                if( arr[j]>arr[j+1]){
                    isSorted = false;
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
            if (isSorted) break;
            System.out.printf("Loop %d ",i+1);
            display(arr);
            System.out.println();
        }
    }
    protected static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int tmp = arr[i];
            int pos = i - 1;

            while (pos >= 0 && arr[pos] > tmp) {
                arr[pos + 1] = arr[pos];
                pos--;
            }

            arr[pos + 1] = tmp;

            System.out.printf("Loop %d: ", i);
            display(arr);
            System.out.println();
        }
    }
    protected static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
