package practice.programmers;

public class _120871 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            while ((answer % 3 == 0) || String.valueOf(answer).contains("3")) {
                System.out.println("i = " + i);
                answer++;
            }
        }

        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120871
