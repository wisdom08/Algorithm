package programmers;

public class _120826 {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for (Character c : my_string.toCharArray()) {
            if (!c.toString().equals(letter)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String solution_2(String my_string, String letter) {
        return my_string.replace(letter, "");
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120826