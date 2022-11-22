package programmers;

import java.util.stream.IntStream;

public class _120831 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            sum += i;
        }
        return sum;
    }

    public int solution_2(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(v -> v % 2 == 0)
                .sum();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120831