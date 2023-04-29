package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);

        int numberOfInput = sc.nextInt();
        int[] array = new int[numberOfInput];

        for (int i = 0; i < numberOfInput; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }
}

// https://www.acmicpc.net/problem/2750
