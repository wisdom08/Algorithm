/**
 * https://leetcode.com/problems/move-zeroes/
 * 정수 배열이 주어지면 0이 아닌 값은 상대적 순서를 유지하고 모든 0은 끝으로 이동하게 만든다.
 * 배열 복사본 X
 * <p>
 * 계획
 * 0이 아닌 값을 먼저 array 에 담는다.
 * index 는 기억하기
 * 해당 index 에 0인 값을 넣는다.
*/
package leetcode.java;

public class MoveZeros {
    public static void main(String[] args) {
        Solution05 solution = new Solution05();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

}

class Solution05 {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while (index < length) {
            nums[index] = 0;
            index++;
        }
    }
}
