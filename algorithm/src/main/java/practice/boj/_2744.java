package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _2744 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);
        String words = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) ('a' + ch - 'A'));
            } else {
                sb.append((char) ('A' + ch - 'a'));
            }
        }
        System.out.println(sb);
    }
}

/*
* https://www.acmicpc.net/problem/2744
* 배운 점
* 아스키코드를 이용한 대소문자 변환
* - base(소문자라면 ‘a’, 대문자라면 ‘A’)로부터 몇 번째 알파벳(idx)인지를 찾아서 더한다.
* */
