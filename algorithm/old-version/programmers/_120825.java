package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _120825 {
    public static void main(String[] args) {
        String hello = solution_2("hello", 3);
        System.out.println("hello = " + hello);
    }
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            sb.append(c.toString().repeat(n));
        }
        return sb.toString();
    }

    public static String solution_2(String s, int n) {
        return Arrays.stream(s.split("")).map(v -> v.repeat(n)).collect(Collectors.joining());
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120825