package boj.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        while (num >= 5) {
            count += num / 5;
            num /= 5;
        }
        System.out.println(count);
    }
}

/*
* https://www.acmicpc.net/problem/1676
* 회고
* 팩토리얼값을 나열해보면서 규칙을 파악해봤다. 5의 갯수에 따라 값이 변화하는 걸 캐치하고
* 반복문을 통해 5로 나누면서 누적합을 구했다. 
* */