package practice.programmers;

import java.util.Arrays;

public class _120862 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int num1 = numbers[0] * numbers[1];
        int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return num1 < num2 ? num2 : num1;
    }

    public int solution_2(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                max = Math.max(max, numbers[i] * numbers[j]);
            }
        }
        return max;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120862