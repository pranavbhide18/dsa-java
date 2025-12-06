package sorting;

import java.util.Arrays;

public class BubbleSort {
    void main() {
        int[] arr = {13,24,46,20,52,9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
