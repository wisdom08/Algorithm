package leetcode.java;

public class _1470 {
    public static void main(String[] args) {
        Solution_1470 solution = new Solution_1470();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] shuffle = solution.shuffle(nums, 3);
        for (int i : shuffle) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index] = nums[i];
            result[index + 1] = nums[n + i];
            index += 2;
        }
        return result;
    }
}

class Solution_1470_2{
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
            result[i*2+ 1] = nums[n + i];
        }
        return result;
    }
}