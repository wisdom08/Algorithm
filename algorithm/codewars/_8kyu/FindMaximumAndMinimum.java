package codewars._8kyu;

import java.util.Arrays;

public class FindMaximumAndMinimum {
    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}

/*
* https://www.codewars.com/kata/577a98a6ae28071780000989/train/java
* 회고
*  Arrays.sort(list); sort 정렬하고 첫 번째 값하고 마지막값 리턴하는 방법도 있다.
* */