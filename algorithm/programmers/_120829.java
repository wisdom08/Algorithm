package programmers;

public class _120829 {
    public int solution(int angle) {
        if (angle < 90) return 1;
        if (angle == 90) return 2;
        if (angle == 180) return 4;
        return 3;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120829