package leetcode.java;

public class _1672 {
    public static void main(String[] args) {
        Solution_1672 s = new Solution_1672();
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        int result = s.maximumWealth(arr);
        System.out.println("result = " + result);
    }
}

class Solution_1672 {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] a : accounts) {
            int sum  = 0;
            for (int j : a) {
                sum += j;
            }
            max = Math.max(max, sum);
        }

        return max;
    }
}

/*
* https://leetcode.com/problems/richest-customer-wealth/
* 회고
* 리트코드는 Discuss 탭이 진짜 매력적이다.
* 좋은 풀이들이 너무 많다.
* 하나 하나씩 내 걸로 만들어야겠다.
* */