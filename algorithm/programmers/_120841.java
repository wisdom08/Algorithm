package programmers;

public class _120841 {
    public int solution(int[] dot) {
        if(dot[0] > 0 && dot[1] > 0) return 1;
        if(dot[0] > 0 && dot[1] < 0) return 4;
        if(dot[0] < 0 && dot[1] > 0) return 2;

        return 3;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120841