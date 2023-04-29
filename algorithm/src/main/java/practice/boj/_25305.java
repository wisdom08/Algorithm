package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class _25305 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);

        int numberOfParticipants = sc.nextInt();
        int numberOfWinners = sc.nextInt();

        int[] array = new int[numberOfParticipants];

        for (int i = 0; i < numberOfParticipants; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        System.out.println(array[array.length-numberOfWinners]);

    }
}

// https://www.acmicpc.net/problem/25305
