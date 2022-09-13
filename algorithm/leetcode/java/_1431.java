package leetcode.java;

import java.util.ArrayList;
import java.util.List;

public class _1431 {
    public static void main(String[] args) {
        Solution_1431 solution = new Solution_1431();
        int[] nums = {2, 3, 5, 1, 3};
        List<Boolean> booleans = solution.kidsWithCandies(nums, 3);
        for (Boolean aBoolean : booleans) {
            System.out.println("aBoolean = " + aBoolean);
        }
    }
}

class Solution_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>(candies.length);

        int max = 0;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }

        max -= extraCandies;

        for (int candy : candies) {
            result.add(candy >= max);
        }

        return result;
    }
}