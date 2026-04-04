package Sorting_Algo;

import java.util.*;

public class Insertion_sort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // element to insert
            int j = i - 1;

            // shift elements to right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;  // place at correct position
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
