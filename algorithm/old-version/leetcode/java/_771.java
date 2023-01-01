package leetcode.java;

public class _771 {
    public static void main(String[] args) {
        Solution_771 s = new Solution_771();
        int i = s.numJewelsInStones("aA", "aAAbbbb");
        System.out.println("i = " + i);
    }
}

class Solution_771 {
    public int numJewelsInStones(String jewels, String stones) {
        char[] stonesArr = stones.toCharArray();
        char[] jewelsArr = jewels.toCharArray();
        int sum = 0;
        for (char c : stonesArr) {
            for (char j : jewelsArr) {
                if (c == j) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int numJewelsInStones_2(String jewels, String stones) {
        int count = 0;

        for (Character c : stones.toCharArray()) {
            if(jewels.contains(c.toString())) count++;
        }

        return count;
    }
}

/*
* https://leetcode.com/problems/jewels-and-stones/submissions/
* 회고
* charAt, indexOf 를 쓸 수도 있고 문제를 풀 수 있는 방식은 진짜 다양하다.
* */