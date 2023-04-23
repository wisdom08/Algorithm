package practice.programmers;

public class _120912 {
    public int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            String stringNumber = Integer.toString(i);
            for (int j = 0; j < stringNumber.length(); j++) {
                if (stringNumber.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        return answer;
    }

    public int solution_2(int[] array) {
        int answer = 0;

        for (int i : array) {
            answer += countChar(Integer.toString(i), '7');
        }

        return answer;
    }

    private long countChar(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120912
