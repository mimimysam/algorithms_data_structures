package sorting;

import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 4, 8, 2};
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for (int i=0; i < arr.length; i++) {
            for (int j=1; j < arr.length - 1; j++) {
                if (arr[j-1] > arr[j]) {
                    int x = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = x;
                }
            }
        }
    }
}