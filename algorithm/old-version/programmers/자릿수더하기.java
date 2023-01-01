package programmers;

public class 자릿수더하기 {
    public int solution(int n) {
        int sum = 0;
        char[] chars = Integer.toString(n).toCharArray();
        for (Character c : chars) {
            sum += Integer.parseInt(c.toString());
        }
        return sum;
    }

    public int solution_2(int n) {
        int answer = 0;
        while (n>10) {
            answer += n%10;
            if (n < 10) {
                break;
            }
            n = n / 10;
        }

        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12931?language=java