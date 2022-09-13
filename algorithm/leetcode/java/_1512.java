package leetcode.java;

public class _1512 {
    public static void main(String[] args) {
        Solution_1512 solution = new Solution_1512();
        int[] nums = {1,1,1,1};
        int result = solution.numIdenticalPairs(nums);
        System.out.println("result = " + result);
    }
}

class Solution_1512 {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) result++;
            }
        }
        return result;
    }
}