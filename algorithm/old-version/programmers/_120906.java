package programmers;

public class _120906 {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public int solution_2(int n) {
        int answer = 0;
        String[] split = String.valueOf(n).split("");
        for (String s : split) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120906