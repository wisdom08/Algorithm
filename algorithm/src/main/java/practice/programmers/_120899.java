package practice.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _120899 {
    public int[] solution(int[] array) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        return new int[]{max, index};
    }

    public int[] solution_2(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int[] answer = new int[2];
        answer[0] = list.stream().max(Integer::compareTo).orElse(0);
        answer[1] = list.indexOf(answer[0]);
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120899