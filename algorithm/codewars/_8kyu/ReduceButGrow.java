package codewars._8kyu;

import java.util.Arrays;

public class ReduceButGrow {
    public static int grow(int[] x){
        int result = 1;
        for (int i : x) {
            result*=i;
        }
        return result;
    }

    public static int grow_2(int[] x){
        return Arrays.stream(x).reduce(1, (a, b) -> a * b);
    }
}
/*
* https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java
* 회고
* JS로 codewars를 풀 때 reduce, map 등을 의도적으로 많이 쓰면서 익숙해지려고 연습했던 기억이 난다. 자바 스트림을 어렵게만 생각했는데 비슷한듯.
* */