package programmers;

public class _120824 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            if (i % 2 == 0) {
                ++answer[0];
            } else {
                ++answer[1];
            }
        }
        return answer;
    }

    public int[] solution_2(int[] num_list) {
        int[] answer = new int[2];
        for (int i = 0; i < num_list.length; i++) {
            ++answer[num_list[i] % 2];
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120824