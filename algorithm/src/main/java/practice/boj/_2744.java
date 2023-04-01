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
* */
