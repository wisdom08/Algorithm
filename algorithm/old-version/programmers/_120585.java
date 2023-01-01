package programmers;

import java.util.Arrays;

public class _120585 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i : array) {
            if(i > height) ++answer;
        }
        return answer;
    }

    public int solution_2(int[] array, int height) {
        return (int) Arrays.stream(array).filter(v -> v > height).count();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120585