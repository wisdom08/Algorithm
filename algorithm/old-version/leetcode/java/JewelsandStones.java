/**
 * https://leetcode.com/problems/jewels-and-stones/
 * 문제 분석
 * 보석은 대소문자를 구분해서 갖고 있어야 한다.
 * aA -> 2개
 *
 * 계획
 * 보석을 저장한다 set
 * 돌을 한 글자 씩 for문 루프
 * set에 있는 값과 비교해서 count
 *
 * */

package leetcode.java;

import java.util.HashSet;

public class JewelsandStones {
    public static void main(String[] args) {
        Solution02 solution = new Solution02();
        int result = solution.numJewelsInStones("aA", "aAAbbbb");
        System.out.println("result = " + result);
    }
}

class Solution02 {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();

        char[] chars = jewels.toCharArray();
        for (char c : chars) {
            set.add(c);
        }

        int count = 0;
        char[] stoneArr = stones.toCharArray();
        for (char stone : stoneArr) {
            if (set.contains(stone)) {
                count++;
            }
        }

        return count;
    }
}

/**
 * 회고
 * 문제가 잘 풀리니까 재밌다.
 * */
