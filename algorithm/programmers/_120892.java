package programmers;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _120892 {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        char[] chars = cipher.toCharArray();
        for (int i = code; i <= chars.length; i += code) {
            sb.append(chars[i-1]);
        }
        return sb.toString();
    }

    public String solution_2(String cipher, int code) {
        return IntStream.range(0, cipher.length())
                .filter(v -> v % code == code - 1)
                .mapToObj(c -> String.valueOf(cipher.charAt(c)))
                .collect(Collectors.joining());
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120892