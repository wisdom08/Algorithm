package practice.programmers;

public class _42842 {
    public static void main(String[] args) {
        Solution_42842 solution42842 = new Solution_42842();
        int[] solution = solution42842.solution(10, 2);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_42842 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int area = brown + yellow;
        for (int row = 1; row <= area/2+1; row++) {
            if (area % row == 0) {
                int column = area / row;

                int brownOfBackup = 2 * (row + column) - 4;
                int yellowOfBackup = (row * column) - (2 * (row + column)) + 4;

                if (yellowOfBackup == yellow && brownOfBackup == brown) {
                    return new int[]{column,row};
                }
            }
        }
        return answer;
    }
}

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/42842
* */
