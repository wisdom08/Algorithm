package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _1543 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);

        String doc = sc.nextLine();
        String word = sc.nextLine();

//        String replacedWord = doc.replace(word, "");
//        int leftLength = doc.length() - replacedWord.length();
//        int count = leftLength / word.length();
//        System.out.println(count);

        int count = 0;
        int startIndex = 0;

        while (true) {
            int findIndex = doc.indexOf(word, startIndex);

            if (findIndex < 0) {
                break;
            }
            count++;
            startIndex = findIndex + word.length();
        }

        System.out.println(count);
    }
}

/*
* https://www.acmicpc.net/problem/1543
* */
