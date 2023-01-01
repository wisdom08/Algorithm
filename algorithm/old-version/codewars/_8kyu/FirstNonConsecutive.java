package codewars._8kyu;

public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] - 1 != array[i - 1]) {
                return array[i];
            }
        }
        return null;
    }
}

/*
* https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/java
* 회고
* 인덱스가 i일 때와 i-1일때 뺀 결과가 1이 아닐 때 리턴하는 게 좀 더 직관적인 것 같다.
* */