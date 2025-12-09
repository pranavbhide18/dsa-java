package Arrays.part1;

public class SecondLargestElement {
    void main() {
        int[] arr = {7,6,};
        System.out.println(secondLargest(arr));
    }

    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if(arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }

        }

        return smax;
    }
}
