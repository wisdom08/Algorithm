package practice.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _217 {
    public static void main(String[] args) {
        Solution_217 solution = new Solution_217();
        boolean result = solution.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2});
        System.out.println("result = " + result);
    }
}

class Solution_217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }

    public boolean containsDuplicate_2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate_3(int[] nums) {
        return nums.length > Arrays.stream(nums).distinct().count();
    }

    public boolean containsDuplicate_4(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
