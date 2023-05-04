package practice.leetcode;

import java.util.Arrays;

public class _1299 {
    public static void main(String[] args) {
        Solution_1299 solution1299 = new Solution_1299();
        int[] result = solution1299.replaceElements_2(new int[]{17, 18, 5, 4, 6, 1});
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}

class Solution_1299 {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                result[i] = -1;
                return result;
            }
            int max = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        return result;
    }

    public int[] replaceElements_2(int[] arr) {
        int[] result = new int[arr.length];
        int maxValue = -1;
        for(int x = arr.length-1; x >=0; x--) {
            result[x] = maxValue;
            maxValue = Math.max(arr[x], maxValue);
        }
        return result;
    }
}

/*
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 * 문제 풀이 흐름
 * 1. 배열 내림차순 정렬
 * 2. 마지막 원소 -1로 바꾸기
 * */
