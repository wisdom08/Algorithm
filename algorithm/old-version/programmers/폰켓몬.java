package programmers;

import java.util.TreeSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        Solution_1845 p = new Solution_1845();
        int result = p.solution(new int[]{3, 3, 3, 2, 2, 4});
        System.out.println("result = " + result);
    }
}

class Solution_1845 {
    public int solution(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return Math.min(set.size(), nums.length / 2);
    }
}