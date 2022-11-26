package programmers;

import java.util.Arrays;

public class _120809 {
    public int[] solution(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    public int[] solution_2(int[] numbers) {
        return Arrays.stream(numbers).map(v -> v * 2).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120809