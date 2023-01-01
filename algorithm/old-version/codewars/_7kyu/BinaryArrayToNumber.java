package codewars._7kyu;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        StringBuilder sb = new StringBuilder();
        for (Integer integer : binary) {
            sb.append(integer);
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}

/*
* https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java
* */