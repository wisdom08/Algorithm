package practice.programmers;

import java.util.Arrays;

public class _120911 {
    public String solution(String my_string) {
        char[] chars = my_string.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public String solution_2(String my_string) {
        return my_string.toLowerCase()
                .chars()
                .sorted()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120911