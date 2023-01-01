package programmers;

public class _12918 {
    public static boolean solution(String s) {
        if ((s.length() != 4 && s.length() != 6)) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12918?language=java