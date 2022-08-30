package codingtest.java;

import java.util.Scanner;

public class _01_02 {
    public static String solution_2(String str) {
        StringBuilder answer = new StringBuilder();
        char[] chars = str.toCharArray();

        for (char c : chars) {

            if(c >= 97 && c <= 122) answer.append((char) (c - 32));
            else answer.append((char) (c + 32));
        }

        return answer.toString();
    }

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if(Character.isLowerCase(c)) answer.append(Character.toUpperCase(c));
            else answer.append (Character.toLowerCase(c));
        }

        return answer.toString();
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(solution_2(str));
    }
}
