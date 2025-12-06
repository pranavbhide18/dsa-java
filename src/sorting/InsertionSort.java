package sorting;

import java.util.Arrays;

public class InsertionSort {
    void main() {
        int[] arr = {13,24,45,52,20,9};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int j = i;

            while(j > 0 && arr[j] < arr[j - 1]){
                swap(arr, j, j -1);
                j--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
