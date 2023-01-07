package practice.programmers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class _120834 {
    public String solution(int age) {

        StringBuilder sb = new StringBuilder();

        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, (char) (97 + i));
        }

        String s = String.valueOf(age);
        for (char c : s.toCharArray()) {
            sb.append(map.get(Integer.parseInt(Character.toString(c))));
        }

        return sb.toString();
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120834
