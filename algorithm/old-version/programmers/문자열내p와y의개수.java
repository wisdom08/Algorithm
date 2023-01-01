package programmers;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        char[] chars = s.toUpperCase().toCharArray();
        for (char c : chars) {
            if (c == 'P') {
                ++p;
            } else if(c == 'Y'){
                ++y;
            }
        }
        return p==y;
    }

    boolean solution_2(String s) {
        return s.toUpperCase().chars().filter(e -> 'P' == e).count() == s.toUpperCase().chars().filter(e -> 'Y' == e).count();
    }

    boolean solution_3(String s) {
        s = s.toUpperCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') {
                ++count;
            } else if (s.charAt(i) == 'Y') {
                --count;
            }
        }
        return count == 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/12916