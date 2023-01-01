package programmers;

public class _120910 {
    public int solution(int n, int t) {
        for(int i = 1; i <= t; i++) {
            n*=2;
        }
        return n;
    }

    public int solution_2(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120910