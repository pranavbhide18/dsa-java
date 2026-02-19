package bitmanipulation;

public class PrintPrime {
    void main() {
        System.out.print(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int[] nums = new int[n + 1];
        int cnt = 0;
        for(int i = 2; i <= n; i++) {
            nums[i] = 1;
        }

        for(int i = 2; i * i <= n; i++) {
            if(nums[i] == 1) {
                int x = 2;

                for(int j = i * i; j <= n; j+= i) {
                    nums[j] = 0;
                }
            }
        }

        for(int i = 2; i <= n; i++) {
            if(nums[i] == 1) cnt++;
        }

        return cnt;
    }
}
