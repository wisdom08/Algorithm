/*
* https://leetcode.com/problems/kth-largest-element-in-an-array/
* 문제 분석
* 정수 배열 nums 와 정수 k가 주어지면 배열에서 k번 째로 큰 요소를 반환한다.
* 정렬 후 값에 대한 가장 큰 요소가 아닌, 유일한 순서 요소
*
* 1. 값을 소팅하고 인덱스값 도출
* 2. 힙 이용
* */

package leetcode.java;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {
    public static void main(String[] args) {
        Solution_KthLargestElement solution = new Solution_KthLargestElement();
        Solution_KthLargestElement_pk solution_pk = new Solution_KthLargestElement_pk();
        int kthLargest = solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        int kthLargestPk = solution_pk.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        System.out.println("kthLargest = " + kthLargest);
        System.out.println("kthLargestPk = " + kthLargestPk);
    }


}

class Solution_KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}

class Solution_KthLargestElement_pk {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : nums) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}

/*
* 회고
* 와 우선순위 큐 신기하다. 어렵게 느껴지긴 하지만 계속 써보면 적응되겠지!
* */
