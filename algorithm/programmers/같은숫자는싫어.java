/*
* 문제 분석
* 배열에서 연속적으로 나타나는 숫자를 제거하고 남은 수들을 리턴하는 함수를 만드는 문제
* 그냥 중복된 숫 제거가 아니라, '연속적으로' 나타나는 숫자를 제거해야 한다는 점에서 스택 문제라고 느꼈다.
*
*
* */
package programmers;

import java.util.Stack;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        Solution_12906 p = new Solution_12906();
        int[] solution = p.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }
}

class Solution_12906 {
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int n : arr) {
            if(stack.isEmpty() || stack.peek() != n) stack.add(n);
        }

        int[] answer = new int[stack.size()];
        int index = 0;

        for (Integer i : stack) {
            answer[index++] = i;
        }

        return answer;
    }
}

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java
* 회고
* 실제 프로덕션을 개발할 때 스택은 어떤 경우에 쓸 수 있을까?
* 가장 최근에 대한 데이터를 컨트롤해야하는 과정에 쓰지 않을까?
* 스택이 LIFO 구조 라는 것 그 이상으로 파악해야함.
* */