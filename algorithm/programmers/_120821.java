package programmers;

import java.util.stream.IntStream;

public class _120821 {
    public int[] solution(int[] numberList) {
        return IntStream
                .range(0, numberList.length)
                .map(i -> numberList[numberList.length - i - 1])
                .toArray();
    }

    public int[] solution_2(int[] numberList) {
        int[] answer = new int[numberList.length];
        for (int i = 0; i < numberList.length; i++) {
            answer[i] = numberList[numberList.length - i - 1];
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120821