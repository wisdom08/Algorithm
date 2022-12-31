package programmers;

import java.util.HashMap;
import java.util.Map;

public class _120812 {
    public int solution(int[] array) {
        int answer = 0;
        int maxCount = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : array) {
            int count = map.getOrDefault(number, 0) + 1;

            if (count > maxCount) {
                maxCount = count;
                answer = number;
            } else if (count == maxCount) {
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120812
