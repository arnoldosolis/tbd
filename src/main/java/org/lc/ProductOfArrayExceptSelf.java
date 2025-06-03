package org.lc;

public class ProductOfArrayExceptSelf {

    // Brute Force - Time O(N^2) - Space is O(N)
    public int[] solution1(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    // Best Solution - Time O(N) - Space is O(N)
    public int[] solution2(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = pre[i] * suff[i];
        }
        return result;
    }
}
