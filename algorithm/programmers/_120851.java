package programmers;

public class _120851 {
    public int solution(String my_string) {
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isDigit(my_string.charAt(i))) {
                answer += Integer.parseInt(String.valueOf(my_string.charAt(i)));
            }
        }
        return answer;
    }

    public int solution_2(String my_string) {
        return my_string.chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isDigit)
                .map(String::valueOf)
                .mapToInt(Integer::valueOf)
                .sum();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120851