package programmers;

import java.util.Arrays;

public class _120847 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length-1] * numbers[numbers.length-2];
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120847