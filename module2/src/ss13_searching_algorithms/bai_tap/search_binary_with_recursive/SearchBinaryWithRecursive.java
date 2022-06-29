package ss13_searching_algorithms.bai_tap.search_binary_with_recursive;

public class SearchBinaryWithRecursive {
    private static int binarySearch(int[] arr, int low, int high, int value){
        
        if (high>= low){
            int mid = low + (high-low)/2;
            if (arr[mid] == value){
                return mid;
            }
            if (arr[mid]>value){
                high = mid -1 ;
                return binarySearch(arr,low,high,value);
            }
            if (arr[mid]<value) {
                low = mid +1;
                return binarySearch(arr, low, high, value);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a={6,13,14,25,33,43,51,53,64,74,84,93,95,96,97};
        System.out.println(binarySearch(a,0,a.length-1,97));
    }
}
