package programmers;

public class _120837 {
    public int solution(int hp) {
        return hp / 5 + hp % 5 / 3 + hp % 5 % 3;
    }

    public int solution_2(int hp) {
        int cnt = 0;

        cnt += hp / 5;
        hp %= 5;

        cnt += hp / 3;
        hp %= 3;

        cnt += hp / 1;

        return cnt;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120837