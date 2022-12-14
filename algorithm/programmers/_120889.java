package programmers;

import java.util.Arrays;

public class _120889 {
    public int solution(int[] sides) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int side : sides) {
            sum += side;
            if (max < side) {
                max = side;
            }
        }
        return max < sum-max ? 1 : 2;
    }

    public int solution_2(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120889