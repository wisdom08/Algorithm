/*
* 문제 분석
* - N의 범위가 1~100 이므로 int, long과 같은 숫자형으로 담을 수 없다.
* - 먼저 문자열 형태로 입력값을 받은 후 이를 문자 배열로 반환하고, 문자 배열값을 순서대로 읽으면서 숫자형으로 변환하여 더해야 한다.
*   - 1234 -> '1', '2', '3', '4' -> 1, 2, 3, 4 -> 10
* */

package boj.java;

import java.util.Scanner;

public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        String input = sc.next();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            sum += Character.getNumericValue(c); // [1] 204 ms
            // [2] sum += c - '0'; // 212 ms
        }

//        for (int i = 0; i < chars.length; i++) {
//            sum += Character.getNumericValue(chars[i]);
//        } [3] 208ms

        System.out.println(sum);
    }
}


/*
* https://www.acmicpc.net/problem/11720
* 회고
* 다양한 방법으로 풀어봤는데 크진 않지만 시간 차이가 있다.
* 문제 분석을 잘해야 한다. 이 문제의 핵심은 N의 범위인 것같다. 범위 요구사항 때문에 int과 long은 쓸 수가 없다.
* */