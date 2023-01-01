package leetcode.java;

import java.util.Arrays;

public class _977 {
    public static void main(String[] args) {
        Solution_977 s = new Solution_977();
        int[] result = s.sortedSquares_2(new int[]{-4, -1, 0, 3, 10});
        for (int i : result) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        return nums;
    }

    public int[] sortedSquares_2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);

        return nums;
    }
}

/*
* https://leetcode.com/problems/squares-of-a-sorted-array/
*
* 회고
* 2가지 방식으로 풀었는데 Math.pow() 를 쓰지 않는 게 메모리도 더 적게 먹고, runtime 도 더 빠르다.
* Two Pointers 유형의 문제라고 하는데 같은 유형의 문제를 더 풀어보고 알아봐야겠다.
* */