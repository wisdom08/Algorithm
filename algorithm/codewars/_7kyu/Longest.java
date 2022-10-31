package codewars._7kyu;

import java.util.Arrays;

public class Longest {
    public static String longest (String s1, String s2) {
        char[] chars = s1.concat(s2).toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            String tmp = String.valueOf(c);
            if(sb.indexOf(tmp) == -1){
                sb.append(tmp);
            }

        }
        return sb.toString();
    }
}

/*
* https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
* */