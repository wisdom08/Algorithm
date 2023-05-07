package practice.leetcode;

public class _1 {
    public static void main(String[] args) {
        Solution_1 solution1 = new Solution_1();
        int[] ints = solution1.twoSum(new int[]{2, 7, 11, 15}, 9);
        for (int anInt : ints) {
            System.out.println("anInt = " + anInt);
        }
    }
}

class Solution_1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

// https://leetcode.com/problems/two-sum/
