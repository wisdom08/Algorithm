package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _120905 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public int[] solution_2(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(value -> value % n == 0).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120905