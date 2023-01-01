package programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String element1 : s1) {
            for (String element2 : s2) {
                if (element1.equals(element2)) {
                    ++answer;
                }
            }
        }
        return answer;
    }

    public int solution_2(String[] s1, String[] s2) {
        HashSet<String> set = new HashSet<>(List.of(s1));
        return (int) Arrays.stream(s2).filter(set::contains).count();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120903