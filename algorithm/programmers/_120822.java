package programmers;

public class _120822 {
    public String solution(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public String solution_2(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120822