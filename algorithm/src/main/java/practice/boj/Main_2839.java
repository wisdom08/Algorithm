package practice.boj;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_2839 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("/Users/win/me/algorithm/algorithm/src/main/java/practice/boj/input.txt"));
        Scanner sc = new Scanner(System.in);

        int sugar = sc.nextInt();
        int count = 0;
        while (sugar > 0) {
            if (sugar % 5 == 0) {
                count += sugar / 5;
                System.out.println(count);
                return;
            }

            if (sugar < 3) {
                System.out.println(-1);
                return;
            }

            sugar -= 3;
            count++;

        }
        System.out.println(count);
    }
}

/*
* https://www.acmicpc.net/problem/2839
* */
