package programmers;

import java.util.Arrays;

public class _120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1; i <= num2; i++) {
            answer[i-num1] = numbers[i];
        }
        return answer;
    }

    public int[] solution_2(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120833?language=java