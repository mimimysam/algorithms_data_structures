package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{46, 83, 44, 20, 51, 10};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        for (int i=0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int minVal = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minVal;
        }
    }
}
