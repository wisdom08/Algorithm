package practice.programmers;

import java.util.Arrays;

public class _120891 {
    public int solution(int order) {
        int answer = 0;
        String s = String.valueOf(order);
        for (char c : s.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') ++answer;
        }
        return answer;
    }

    public int solution_2(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120891