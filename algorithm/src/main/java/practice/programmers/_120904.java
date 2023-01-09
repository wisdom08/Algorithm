package practice.programmers;

public class _120904 {
    public int solution(int num, int k) {
        String numString = Integer.toString(num);
        String s = Integer.toString(k);

        return numString.contains(s) ? numString.indexOf(s) + 1 : -1;
    }

    public int solution_2(int num, int k) {
        return (" " + num).indexOf(String.valueOf(k));
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120904