package leetcode.java;

public class _1929 {
    public static void main(String[] args) {
        Solution_1929 solution = new Solution_1929();
        int[] nums = {1, 2, 1};
        solution.getConcatenation(nums);
        solution.getConcatenation_2(nums);
    }
}

class Solution_1929 {
    public int[] getConcatenation(int[] nums) {
        int originalLength = nums.length;
        int[] result = new int[originalLength * 2];
        int iter = 0;
        for (int i = 0; i < result.length; i++) {
            if (iter == originalLength) iter = 0;

            result[i] =nums[iter];
            iter++;
        }
        return result;
    }

    public int[] getConcatenation_2(int[] nums) {
        int originalLength = nums.length;
        int[] result = new int[originalLength * 2];
        for (int i = 0; i < originalLength; i++) {
            result[i] = nums[i];
            result[i + originalLength] = nums[i];
        }
        return result;
    }
}