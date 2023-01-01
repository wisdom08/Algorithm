package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class _1313 {
    public static void main(String[] args) {
        Solution_1313 solution = new Solution_1313();
        int[] nums = new int[]{1, 2, 3, 4};
        int[] result = solution.decompressRLElist(nums);
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i+=2) {
            int count = nums[i];
            int value = nums[i + 1];
            for (int j = 0; j < count; j++) {
                list.add(value);
            }
        }

        int size = list.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}