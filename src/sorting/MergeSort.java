package sorting;

import java.util.Arrays;

public class MergeSort {
    void main() {
        int[] arr = {13,24,45,52,20,9};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if(start >= end) return;

        int mid = (start + end)/2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end) {

            if(arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;

            } else {
              temp[k] = arr[j];
              j++;
            }
            k++;
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int x = start; x <= end; x++) {
            arr[x] = temp[x - start];
        }

    }

}
