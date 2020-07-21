package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 4, 8, 2};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]) {
                int x = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = x;
                j = j-1;
            }
        }
    }
}
