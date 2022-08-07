/*
* https://leetcode.com/problems/k-closest-points-to-origin/
* */

package leetcode.java;

import java.util.PriorityQueue;
import java.util.Queue;

public class _973 {
    public static void main(String[] args) {
        Solution_973 solution = new Solution_973();
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1 ;
        solution.kClosest(points, k);
    }
}

class Solution_973 {
    public int[][] kClosest(int[][] points, int k) {
        // 1.data structure
        Queue<int[]> pq = new PriorityQueue<>((a, b) ->
                (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]));

        int[][] res = new int[k][2];

        // 2. for, while
        for (int[] p : points) {
            pq.offer(p);
        }

        int index = 0;
        while (index < k) {
            res[index] = pq.poll();
            index++;
        }
        return res;
    }
}
