package programmers;

import java.util.Arrays;

public class _120854 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    public int[] solution_2(String[] strlist) {
        return Arrays.stream(strlist).mapToInt(String::length).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120854