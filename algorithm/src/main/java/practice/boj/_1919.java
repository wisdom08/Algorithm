package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1919 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);


        int result = 0;
        for (int i = 0; i < 26; i++) {
            result += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(result);
    }

    private static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }
}

/*
* https://www.acmicpc.net/problem/1919
* */
