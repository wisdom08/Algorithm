package programmers;

import java.util.stream.IntStream;

public class _120836 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0) ++answer;
        }
        return answer;
    }

    public int solution_2(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }

}

// https://school.programmers.co.kr/learn/courses/30/lessons/120836
