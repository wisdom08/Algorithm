package programmers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _120813 {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i+=2) {
            list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }

    public int[] solution_2(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i+=2) {
            list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] solution_3(int n) {
        return IntStream
                .rangeClosed(1, n)
                .filter(i -> i % 2 == 1)
                .toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120813