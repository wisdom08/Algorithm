package leetcode.java;

public class _1480 {
    public static void main(String[] args) {
        Solution_1480 solution = new Solution_1480();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.runningSum(nums);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_1480 {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) { // 0~3
            for (int j = 0; j <= i; j++) { //
                result[i] += nums[j];
            }
        }
        return result;
    }

    public int[] runningSum_2(int[] nums) {
        int[] result = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; ++i) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}