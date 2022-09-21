package leetcode.java;

public class _121 {
    public static void main(String[] args) {
        Solution_121 s = new Solution_121();
        int i = s.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("i = " + i);
    }
}

class Solution_121 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;
        int currentMinimum = prices [0];
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            currentMinimum = Math.min(currentMinimum, prices[i]);
            profit = prices[i] - currentMinimum;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}

/*
*
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
* 회고
* 이중 for 문으로는 안 풀고 싶어서 고민을 좀 많이 했다. 시간이 꽤 걸리긴했지만 풀어서 기분 좋다.
* */