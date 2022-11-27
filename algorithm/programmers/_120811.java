package programmers;

import java.util.Arrays;

public class _120811 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    public int solution_2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array[array.length / 2];
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120811