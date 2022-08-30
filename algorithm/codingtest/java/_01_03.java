package codingtest.java;

import java.util.Scanner;

public class _01_03 {

    public static String solution(String str) {

        String[] split = str.split(" ");
        String result = "";
        int max = Integer.MIN_VALUE;

        for (String s : split) {
            int length = s.length();
            if (length > max) {
                max = length;
                result = s;
            }
        }

        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution(str));
    }
}
