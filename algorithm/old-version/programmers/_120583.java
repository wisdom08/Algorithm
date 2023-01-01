package programmers;

import java.util.Arrays;

public class _120583 {
    public int solution(int[] array, int n) {
        int answer = 0;
        for (int i : array) {
            if(i == n) answer++;
        }
        return answer;
    }
    public int solution_2(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120583