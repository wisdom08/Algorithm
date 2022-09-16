package leetcode.java;

public class _2011 {
    public static void main(String[] args) {
        Solution_2011 s = new Solution_2011();
        int result = s.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"});
        System.out.println("result = " + result);
    }
}

class Solution_2011 {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String o : operations) {
            System.out.println("o = " + o);

            if (o.contains("+")) {
                ++result;
            } else {
                --result;
            }
        }
        return result;
    }
}

/*
* https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
* 회고
* 와우 ++ 의 위치를 앞 뒤로 바꿨을 뿐인데 속도가 약 60ms 가량 차이가 난다.
* 연산자(+)를 피연산자(숫자)의 앞에 놔두면 더 빠르다.
* 왜 그럴까? 이유를 찾아보자.
* */