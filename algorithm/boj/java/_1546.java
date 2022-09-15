package boj.java;

import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        long max = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if(arr[i] > max) max = arr[i];
            sum += arr[i];
        }

        System.out.println(sum * 100.0 / max / n);
    }
}

/*
* https://www.acmicpc.net/problem/1546
* 회고
* 문제를 잘 분석 하는게 중요하다.
* */