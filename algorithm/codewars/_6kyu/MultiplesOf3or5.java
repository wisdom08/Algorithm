package codewars._6kyu;

public class MultiplesOf3or5 {
    public static void main(String[] args) {
        Solution_MultiplesOf3or5 s = new Solution_MultiplesOf3or5();
        int i = s.solution(10);
        System.out.println("i = " + i);
    }
}

class Solution_MultiplesOf3or5 {
    public int solution(int number) {
        if(number < 0) return 0;

        int sum = 0;
        for (int i = 3; i < number; i++) {
            if (i % 3 == 0 || i % 5 ==0) {
                sum += i;
            }
        }
        return sum;
    }
}

/*
* https://www.codewars.com/kata/514b92a657cdc65150000006/java
* 회고
* codewars 에서 clever 하게 푼 것들 구경하는게 재밌다.
* */