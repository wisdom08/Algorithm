package programmers;

import java.util.Scanner;

public class _120823 {

    public static final String STAR = "*";
    public static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            sb.append(STAR.repeat(i));
            sb.append(NEW_LINE);
        }
        System.out.println(sb);
    }
}

// https://school.programmers.co.kr/learn/courses/30/lessons/120823