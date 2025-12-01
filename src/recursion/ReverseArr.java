package recursion;

import java.util.Arrays;

public class ReverseArr {
    void main() {
        int[] arr = {1,2,1,1,5,1};
        reverseArray(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int [] arr, int n){
        if(n >= arr.length/2) return;
        swap(arr, n, arr.length - n - 1);
        reverseArray(arr, n + 1);
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
