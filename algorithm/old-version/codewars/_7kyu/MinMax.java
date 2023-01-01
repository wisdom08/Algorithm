package codewars._7kyu;

import java.util.Arrays;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
        }

        result[0] = min;
        result[1] = max;

        return result;
    }

    public static int[] minMax_2(int[] arr) {
        Arrays.sort(arr);
        return new int[]{arr[0], arr[arr.length - 1]};
    }
}

/*
* https://www.codewars.com/kata/559590633066759614000063/java
* */
