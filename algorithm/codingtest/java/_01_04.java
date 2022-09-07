package codingtest.java;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_04 {
    public ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            String tmp = new StringBuilder(s).reverse().toString();
            answer.add(tmp);
        }


        return answer;
    }


    public ArrayList<String> solution_2(String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] chars = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while (lt < rt) {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(chars);
            answer.add(tmp);
        }

        return answer;
    }

    public static void main(String[] args){
        _01_04 T = new _01_04();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = in.next();
        }

        for (String s : T.solution_2(str)) {
            System.out.println("s = " + s);
        }


    }
}
