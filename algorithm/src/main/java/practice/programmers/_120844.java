package practice.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _120844 {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();

        if (direction.equals("right")) {
            list.add(numbers[numbers.length - 1]);
            for (int i = 0; i < numbers.length-1; i++) {
                list.add(numbers[i]);
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(numbers[0]);
        }

        return list.stream().mapToInt(i->i).toArray();
    }

    public int[] solution_2(int[] numbers, String direction) {
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        if (direction.equals("right")) {
            list.add(0, list.get(list.size() - 1));
            list.remove(list.size() - 1);
        } else {
            list.add(list.size(), list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120844