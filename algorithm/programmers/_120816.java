package programmers;

public class _120816 {
    public int solution(int slice, int n) {
        if(n % slice == 0) return n / slice;
        return n / slice + 1;
    }

    public int solution_2(int slice, int n) {
        return n % slice == 0 ? n / slice : n / slice + 1;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120816