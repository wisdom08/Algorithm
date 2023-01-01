package leetcode.java;

public class _704 {
    public static void main(String[] args) {
        Solution_704 s = new Solution_704();
        int result = s.search_2(new int[]{-1, 0, 3, 5, 9, 12}, 9);
        System.out.println("result = " + result);
    }
}

class Solution_704 {
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i;
        }
        return -1;
    }

    public int search_2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target ) return mid;
            else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

/*
* https://leetcode.com/problems/binary-search/submissions/
* 회고
* Binary Search 문제를 풀어봤다. 관련 개념 공부해야겠다. 내가 푼 답안은 속도가 너무 느린 거 같다. 더 효율적인 방법이 있을 거 같다!
 * */