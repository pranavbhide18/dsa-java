package stacksNQueue;

public class TrappingRainWater {
    void main() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int total = 0;
//        int[] pMax = findPrefix(height);
        int[] sMax = findSuffix(height);
        int pMax = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++) {
            pMax = Math.max(pMax, height[i]);
            int rightMax = sMax[i];
            int curr = height[i];
            if(curr < pMax && curr < rightMax) {
                total += Math.min(pMax, rightMax) - curr;
            }
        }

        return total;
    }

    public static int[] findPrefix(int[] height) {
        int[] prefix = new int[height.length];
        prefix[0] = height[0];
        for(int i = 1; i < height.length; i++) {
            prefix[i] = Math.max(prefix[i - 1], height[i]);
        }

        return prefix;
    }

    public static int[] findSuffix(int[] height) {
        int n = height.length;
        int[] suffix = new int[n];
        suffix[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], height[i]);
        }

        return suffix;
    }
}
