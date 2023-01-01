package codewars._8kyu;

import java.util.ArrayList;

public class MultipleOfIndex {
    public static int[] multipleOfIndex(int[] array) {
        ArrayList<Integer> multipleOfIndex = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i!=0 && array[i] % i == 0) {
                multipleOfIndex.add(array[i]);
            }
        }
        return multipleOfIndex.stream().mapToInt(i -> i).toArray();
    }
}

// https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java