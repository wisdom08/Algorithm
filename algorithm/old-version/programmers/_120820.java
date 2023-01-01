package programmers;

import java.time.LocalDate;

public class _120820 {
    public int solution(int age) {
        LocalDate today = LocalDate.now();
        return today.getYear()-age+1;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120820