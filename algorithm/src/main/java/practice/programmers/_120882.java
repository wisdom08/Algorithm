package practice.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _120882 {
    public int[] solution(int[][] score) {
        List<Integer> scoreList = new ArrayList<>();
        for(int[] t : score){
            scoreList.add(t[0] + t[1]);
        }
        scoreList.sort(Comparator.reverseOrder());

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++){
            answer[i] = scoreList.indexOf(score[i][0] + score[i][1])+1;
        }
        return answer;
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120882
