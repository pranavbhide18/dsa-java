package Arrays.part1;

public class LargestElement {
    void main() {
        int[] arr = {12, 5, 9, 3, 15, 8, 1};
        System.out.println(findLargest(arr));
    }

    static int findLargest(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        return max;
    }
}
