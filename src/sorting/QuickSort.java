package sorting;

import java.util.Arrays;

public class QuickSort {
    void main() {
        int[] arr = {13,24,45,52,20,9};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {

         if(low >= high) return;

        int pIndex = findPartition(arr, low, high);

        quickSort(arr, low, pIndex - 1);
        quickSort(arr, pIndex + 1, high);
    }

    static int findPartition(int[] arr, int low, int high) {

        int pivot = low;
        int i = low + 1;
        int j = high;

        while(i <= j) {

            while(i <= j && arr[i] <= arr[pivot]) i++;
            while(i <= j && arr[j] > arr[pivot]) j--;

            if(i > j) break;

            swap(arr, i ,j);
        }

        swap(arr, pivot, j);
        return j;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



}
