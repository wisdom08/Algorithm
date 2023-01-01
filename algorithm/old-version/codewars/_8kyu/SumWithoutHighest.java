package codewars._8kyu;

import java.util.Arrays;

public class SumWithoutHighest {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            return 0;
        }

        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length -1; i++) {
            sum += numbers[i];
        }

        return sum;
    }
}

/*
* https://www.codewars.com/kata/576b93db1129fcf2200001e6/java
* 회고
* 답변에 length < 3 을 기준으로 한 것도 많았는데 그 이유를 잘 모르겠다.
* */