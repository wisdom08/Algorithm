package leetcode.java;

public class _2006 {
    public static void main(String[] args) {
        Solution_2006 s = new Solution_2006();
        int result = s.countKDifference(new int[]{1, 2, 2, 1}, 1);
        System.out.println("result = " + result);
    }
}

class Solution_2006 {
    public int countKDifference(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}

/*
* https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/submissions/
* 회고
* 이중 for문을 안 쓰고 풀 수 있는 방법을 찾아봐야겠다.
* */