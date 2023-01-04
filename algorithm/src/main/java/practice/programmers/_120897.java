package practice.programmers;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class _120897 {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    public int[] solution_2(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/120897