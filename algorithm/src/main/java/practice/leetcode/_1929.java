package practice.leetcode;

public class _1929 {
    public static void main(String[] args) {
        Solution_1929 solution = new Solution_1929();
        int[] concatenation = solution.getConcatenation(new int[]{1, 2, 1});
        for (int i : concatenation) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_1929 {
    public int[] getConcatenation(int[] nums) {
        int lengthOfInputArr = nums.length;
        int[] result = new int[lengthOfInputArr*2];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i % lengthOfInputArr];
        }
        return result;
    }

    public int[] getConcatenation_2(int[] nums) {
        int[] result = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[i];
            result[i + nums.length] = nums[i];
        }
        return result;
    }

}

/*
* https://leetcode.com/problems/concatenation-of-array/
*
* 문제 풀이 흐름
* 1. 입력값 배열의 길이를 구한다.
* 2. 앞에서 구한 길이 * 2 의 길이를 가진 새로운 배열을 만든다.
* 3. 반복문을 돌린다.
* */
