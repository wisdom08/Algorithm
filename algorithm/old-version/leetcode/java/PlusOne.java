/**
 * https://leetcode.com/problems/plus-one/
 * 문제 분석
 * 배열의 마지막 숫자에 1을 더한다.
 * 마지막 숫자가 9라면? 모든 자리 숫자에 전부 1을 더한다.
 * 계획
 * 1. 뒤에서부터 반복문돌린다.
 * 2. 자릿수의 값이 10이라면 그 앞자리 전부 0으로 바꾸고, 맨 앞자리에 1을 추가한다.
 **/

package leetcode.java;

public class PlusOne {
    public static void main(String[] args) {
        Solution04 solution = new Solution04();
        int[] ints = solution.plusOne(new int[]{4,3,2,1});
        for (int i : ints) {
            System.out.println("i = " + i);
        }
    }
}

class Solution04 {
    public int[] plusOne(int[] digits) {

        int length = digits.length;

        for (int i = length-1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[length + 1];
        result[0] = 1;

        return result;
    }
}

/*
 * 회고
 * 필요한 공간을 잘 생각하고 잘 만드는 게 중요한 거 같다.
 */
