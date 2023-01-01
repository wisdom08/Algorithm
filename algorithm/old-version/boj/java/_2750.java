package boj.java;

import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}

/*
* https://www.acmicpc.net/problem/2750
*
* 회고
* sort 메서드로 간단하게 품
* Arrays.sort():
* Sorts the specified array into ascending numerical order.
* */