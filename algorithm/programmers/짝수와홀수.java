package programmers;

public class 짝수와홀수 {
    public static void main(String[] args) {
        Solution_12937 p = new Solution_12937();
        String solution = p.solution(3);
        System.out.println("solution = " + solution);
    }
}

class Solution_12937 {
    public String solution(int num) {
        if(num%2 == 0) return "Even";
        else return "Odd";
    }
}
