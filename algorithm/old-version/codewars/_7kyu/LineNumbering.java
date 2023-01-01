package codewars._7kyu;

import java.util.Arrays;
import java.util.List;

public class LineNumbering {

    public static void main(String[] args) {
        List<String> number = number((Arrays.asList("a", "b", "c")));
        System.out.println("number = " + number);
    }
    public static List<String> number(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            lines.set(i, (i + 1)+": "+lines.get(i));
        }
        return lines;
    }
}

/*
* https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java
* */
