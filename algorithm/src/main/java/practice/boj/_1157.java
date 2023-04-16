package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
* - 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
* 1. A~Z까지 반복문 돌면서 maxCount 와 maxAlphabet 값을 교체한다.
* */
public class _1157 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int maxCount = -1;
        char maxAlphabet = '?';

        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            int count = getAlphabetCount(str, alphabet);
            if (count > maxCount) {
                maxCount = count;
                maxAlphabet = alphabet;
            } else if (count == maxCount) {
                maxAlphabet = '?';
            }
        }

        System.out.println(maxAlphabet);
    }

    private static int getAlphabetCount(String str, char alphabet) {
         int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (alphabet == str.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

/*
* https://www.acmicpc.net/problem/1157
* */
