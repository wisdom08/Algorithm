package codingtest.java;

import java.util.Scanner;

public class _01_03 {

    public static String solution_02(String str) {

        String result = "";
        int max = Integer.MIN_VALUE, pos;

        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > max) {
                max = len;
                result = tmp;
            }
            str = str.substring(pos + 1);
        }

        if(str.length() > max) result = str;
        return result;
    }

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

        System.out.println(solution_02(str));
    }
}
