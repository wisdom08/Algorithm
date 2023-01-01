package codewars._6kyu;

import java.util.Arrays;

public class FindUniq {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length-1]:arr[0];
    }
}

// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java