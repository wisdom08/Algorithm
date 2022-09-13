package leetcode.java;

import java.util.Arrays;
import java.util.HashMap;

public class _1365 {
    public static void main(String[] args) {
        Solution_1365 solution = new Solution_1365();
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = solution.smallerNumbersThanCurrent(nums);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] copy = nums.clone();
        int count = 0;
        Arrays.sort(copy);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : copy) {
            if (!map.containsKey(i)) {
                map.put(i, count);
            }
            count++;
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}