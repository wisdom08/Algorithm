package codewars._7kyu;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

    public static void main(String[] args) {
        int i = sortDesc2(42145);
        System.out.println("i = " + i);
    }

    public static int sortDesc(final int num) {
        char[] chars = Integer.toString(num).toCharArray();
        Integer[] ints = new Integer[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = Integer.parseInt(String.valueOf(chars[i]));
        }

        Arrays.sort(ints, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i : ints) {
            sb.append( i);
        }
        return Integer.parseInt(sb.toString());
    }

    public static int sortDesc2(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}

/*
* https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java
* 회고
* 역순 정렬이 생각 안 나서 검색해서 풀었다. String을 split 으로 배열화하고 join으로 다시 String으로 만들기!
* char[] 로 바꾸는 것보다 더 깔끔한 것같다.
* */