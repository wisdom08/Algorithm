package practice.leetcode;

public class _70 {
    public static void main(String[] args) {
        Solution_70 solution70 = new Solution_70();
        int i = solution70.climbStairs(3);
        System.out.println("i = " + i);
    }
}

class Solution_70 {
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        int[] answer = new int[n+1];

        answer[1] = 1;
        answer[2] = 2;
        answer[3] = 3;

        for (int i = 4; i <= n; i++) {
            answer[i] = answer[i - 1] + answer[i - 2];
        }
        return answer[n];
    }
}
