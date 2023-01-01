package programmers;

public class _120814 {
    public int solution(int n) {
        if(n % 7 == 0) return n / 7;
        return (int) (Math.ceil(n / 7) + 1);
    }

    public int solution_2(int n) {
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120814