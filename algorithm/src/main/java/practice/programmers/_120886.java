package practice.programmers;

import java.util.Arrays;

public class _120886 {

    public int solution(String before, String after) {
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        String beforeString = new String(beforeArray);
        String afterString = new String(afterArray);

        return beforeString.equals(afterString) ? 1 : 0;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120886?
