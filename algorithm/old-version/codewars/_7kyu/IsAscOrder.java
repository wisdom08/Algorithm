package codewars._7kyu;

import java.util.Arrays;

public class IsAscOrder {
    public static boolean isAscOrder(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAscOrder_2(int[] arr) {
        int[] clone = arr.clone();
        Arrays.sort(arr);
        return Arrays.equals(arr, clone);
    }
}

// https://www.codewars.com/kata/56b7f2f3f18876033f000307/train/java