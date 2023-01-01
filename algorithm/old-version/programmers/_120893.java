package programmers;

import java.util.stream.Collectors;

public class _120893 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] chars = my_string.toCharArray();
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    public String solution_2(String my_string) {
        return my_string.chars()
                .mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ?
                        Character.toUpperCase(operand) : Character.toLowerCase(operand))))
                .collect(Collectors.joining());
    }
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120893