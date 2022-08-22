package leetcode.java;

public class _1920 {
    public static void main(String[] args) {
        Solution_1920 solution = new Solution_1920();
        int[] input = {0, 2, 1, 5, 3, 4};
        solution.buildArray(input);
    }
}

class Solution_1920 {
    public int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}