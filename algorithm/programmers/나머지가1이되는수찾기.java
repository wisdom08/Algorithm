package programmers;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        Solution_87389 p = new Solution_87389();
        int solution = p.solution(10);
        System.out.println("solution = " + solution);
    }
}

class Solution_87389 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}