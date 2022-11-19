package programmers;

import java.util.Arrays;

public class _120817 {
    public double solution(int[] numbers) {
        double answer = 0;
        for (int number : numbers) {
            answer += number;
        }
        return answer/numbers.length;
    }

    public double solution_2(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120817