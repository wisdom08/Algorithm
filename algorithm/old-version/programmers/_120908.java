package programmers;

public class _120908 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }

    public int solution_2(String str1, String str2) {
        return str1.indexOf(str2) > -1 ? 1 : 2;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120908