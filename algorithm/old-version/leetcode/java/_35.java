package leetcode.java;

public class _35 {
    public static void main(String[] args) {
        Solution_35 s = new Solution_35();
        int result = s.searchInsert(new int[]{1, 3, 5, 6}, 2);
        System.out.println("result = " + result);
    }
}

class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
}


/*
* 회고
* https://leetcode.com/problems/search-insert-position/
* 이진 탐색 유형의 문제라고 판단되면 아래의 정형화된 틀을 기억하면 될 것같다.
*
* 이진 탐색 유형의 문제 푸는 아이디어 (오름차순 기준)
* 1. 찾고자 하는 값이 배열[mid] 의 값보다 큰 경우가 start 값을 증가시킨다.  `start =  mid + 1`
* 2. 찾고자 하는 값이 배열[mid] 의 값보다 작은 경우가 end 값을 감소시킨다. `end =  mid - 1`
* 3. 찾고자 하는 값이 배열[mid]에 위치한 경우, mid를 반환한다. `return mid`
* */