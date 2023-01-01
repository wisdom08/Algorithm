package codewars._8kyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> divisible = new ArrayList<>();
        for (int number : numbers) {
            if (number % divider == 0) {
                divisible.add(number);
            }
        }
        return divisible.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }

    public static int[] divisibleBy_2(int[] numbers, int divider) {
        return Arrays.stream(numbers)
            .filter(i -> (i % divider) == 0)
            .toArray();
    }
}

/*
* https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java
* */
