package boj.java;

import java.util.Scanner;

public class _2562 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int index = 1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}

/*
* 회고
* 와 이렇게 간단한 문제를 해맸다. 처음에 int max = arr[0], int index = 0 으로 담았는데 계속 실패를 해서 왜 그러나 한참 동안 원인을 못찾았다.
* 알고보니 처음에 max 값에 담은 arr[0]의 값이 최댓값인 경우에 for 문 속 if문으로 들어가지 않기 때문에 인덱스값이 틀려서였다.
* 그래서 if 문을 들어가지 않는 경우에도 문제에서 요구하는 index 값이 나올 수 있도록 index 값에 1을 넣어서 해결했다.
* */