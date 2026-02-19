package bitmanipulation;

public class Basic {
    void main() {
//        System.out.println(13 / 2);
//        System.out.println(13 % 2);
        System.out.println(convertDecimalToBinary(84));
//        System.out.println(convertToBinary("1101"));
//        System.out.println(8 >> 1);
//        System.out.println(15  << 1);
        int[] nums = {3,5};
        System.out.println(nums[0] + " | " + nums[1]);
        swap(nums);
        System.out.println(nums[0] + " | " + nums[1]);


    }

    static String convertDecimalToBinary(int decimal) {
        if (decimal == 0) return "0";

        String sign = decimal < 0 ? "-" : "";

        StringBuilder binary = new StringBuilder();
        long num = Math.abs((long)decimal);

        while(num != 1) {
            long mod = num % 2;
            binary.append(mod);
            num = num / 2;
        }

        binary.append(1);
        binary.append(sign);
        return binary.reverse().toString();
    }

    static int convertToBinary(String s) {
        int sum = 0;
        int n = s.length() - 1;
        int p2 = 1;

        for(int i = n; i >= 0; i--) {
            int num = s.charAt(i) - '0';
            sum += num * p2;
            p2 = p2 * 2;
        }

        return sum;
    }

    static void swap(int[] nums) {
        nums[0] = nums[0] ^ nums[1];
        nums[1] = nums[0] ^ nums[1];
        nums[0] = nums[0] ^ nums[1];
    }

}
