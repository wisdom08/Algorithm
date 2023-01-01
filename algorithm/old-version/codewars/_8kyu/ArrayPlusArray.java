package codewars._8kyu;

import java.util.stream.IntStream;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i : arr1) {
            sum += i;
        }
        for (int i : arr2) {
            sum+=i;
        }
        return sum;
    }

    public static int arrayPlusArray_2(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }
}

/*
* https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
* 회고
* 향상된 for 문에서 인덱스를 별도로 추가해주거나 기존 for 문을 사용하면 반복문을 한 번만 사용해도 문제를 해결할 수 있다.
* stream 방식은 단순 인덱스 기반으로 도는 for 문 보다 성능이 안 좋긴 하지만 훨씬 가독성이 좋다.
* */